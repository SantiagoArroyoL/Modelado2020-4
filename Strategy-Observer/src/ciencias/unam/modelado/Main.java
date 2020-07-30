package ciencias.unam.modelado;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Usuario espanol = new Espanol("Espanol1", chat);
        chat.registraObservador(espanol);

        Usuario mexicano = new Mexicano("Mexicano1", chat);
        chat.registraObservador(mexicano);

        Usuario ingles = new Ingles("Ingles1", chat);
        chat.registraObservador(ingles);

        espanol.enviarMensaje("Hola, ¿Cómo estas?");

        mexicano.enviarMensaje("Bien, ¿y tu?");

        espanol.enviarMensaje("Bien tambien");

        ingles.enviarMensaje("I don't understand.");
        
        chat.eliminaObservador(ingles);

        mexicano.enviarMensaje("Bueno, ya se fue jajaja ");
    }
}
