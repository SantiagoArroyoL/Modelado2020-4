package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.MensajeEspanol;
import ciencias.unam.modelado.estrategias.salida.SalidaEspanol;
import ciencias.unam.modelado.estrategias.saludo.SaludoEspanol;

/**
 *
 * Clase que define el comportamiento de un usuario español
 * Inicializamos las estrategias de Saluda, Salida y Mensaje a las correspondientes del usuario español
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Usuario
 * @see Observador
 * @since 30-07-2020
 */
public class Espanol extends Usuario {

    /**
     * Constructor de un usuario Espanol
     * Inicializamos el nombre del usuario y el chat al que pertenece
     * @param nombre El nombre que tendrá nuestro usuario Espanol
     * @param chat El chat al que pertenecerá el usuario Espanol
     */
    public Espanol(String nombre, Chat chat) {
        super(chat);
        super.nombre = nombre;
        estrategiaSaludo = new SaludoEspanol();
        estrategiaMensaje = new MensajeEspanol();
        estrategiaSalida = new SalidaEspanol();
    }
}
