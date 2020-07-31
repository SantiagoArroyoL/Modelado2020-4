package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.MensajeIngles;
import ciencias.unam.modelado.estrategias.salida.SalidaIngles;
import ciencias.unam.modelado.estrategias.saludo.SaludoIngles;

/**
 *
 * Clase que define el comportamiento de un usuario inglés
 * Inicializamos las estrategias de Saluda, Salida y Mensaje a las correspondientes del usuario inglés
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Usuario
 * @see Observador
 * @since 30-07-2020
 */
public class Ingles extends Usuario {

    /**
     * Constructor de un usuario Ingles
     * Inicializamos el nombre del usuario y el chat al que pertenece
     * @param nombre El nombre que tendrá nuestro usuario Ingles
     * @param chat El chat al que pertenecerá el usuario Ingles
     */
    public Ingles(String nombre, Chat chat) {
        super(chat);
        super.nombre = nombre;
        estrategiaSaludo = new SaludoIngles();
        estrategiaMensaje = new MensajeIngles();
        estrategiaSalida = new SalidaIngles();
    }
}
