package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.MensajeMexicano;
import ciencias.unam.modelado.estrategias.salida.SalidaMexicano;
import ciencias.unam.modelado.estrategias.saludo.SaludoMexicano;

public class Mexicano extends Usuario {

    public Mexicano(String nombre, Chat chat) {
        super(chat);
        super.nombre = nombre;
        estrategiaSaludo = new SaludoMexicano();
        estrategiaMensaje = new MensajeMexicano();
        estrategiaSalida = new SalidaMexicano();
    }

}
