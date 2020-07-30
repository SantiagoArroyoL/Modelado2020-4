package ciencias.unam.modelado;

public class Mexicano extends Usuario {

    public Mexicano(String nombre) {
        super.nombre = nombre;
        estrategiaSaludo = new SaludoMexicano();
        estrategiaMensaje = new MensajeMexicano();
        estrategiaSalida = new SalidaMexicano();
    }

}
