package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.MensajeEspanol;
import ciencias.unam.modelado.estrategias.salida.SalidaEspanol;
import ciencias.unam.modelado.estrategias.saludo.SaludoEspanol;

public class Espanol extends Usuario {
    public Espanol(String nombre, Chat chat) {
        super(chat);
        super.nombre = nombre;
        estrategiaSaludo = new SaludoEspanol();
        estrategiaMensaje = new MensajeEspanol();
        estrategiaSalida = new SalidaEspanol();
    }
}
