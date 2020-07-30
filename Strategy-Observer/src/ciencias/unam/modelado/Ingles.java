package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.MensajeIngles;
import ciencias.unam.modelado.estrategias.salida.SalidaIngles;
import ciencias.unam.modelado.estrategias.saludo.SaludoIngles;

public class Ingles extends Usuario {
    public Ingles(String nombre, Chat chat) {
        super(chat);
        super.nombre = nombre;
        estrategiaSaludo = new SaludoIngles();
        estrategiaMensaje = new MensajeIngles();
        estrategiaSalida = new SalidaIngles();
    }
}
