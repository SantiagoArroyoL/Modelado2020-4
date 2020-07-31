package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.MensajeMexicano;
import ciencias.unam.modelado.estrategias.salida.SalidaMexicano;
import ciencias.unam.modelado.estrategias.saludo.SaludoMexicano;

/**
 *
 * Clase que define el comportamiento de un usuario mexicano
 * Inicializamos las estrategias de Saluda, Salida y Mensaje a las correspondientes del usuario mexicano
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Usuario
 * @see Observador
 * @since 30-07-2020
 */
public class Mexicano extends Usuario {

    /**
     * Constructor de un usuario Mexicano
     * Inicializamos el nombre del usuario y el chat al que pertenece
     * @param nombre El nombre que tendrá nuestro usuario Mexicano
     * @param chat El chat al que pertenecerá el usuario Mexicano
     */
    public Mexicano(String nombre, Chat chat) {
        super(chat);
        super.nombre = nombre;
        estrategiaSaludo = new SaludoMexicano();
        estrategiaMensaje = new MensajeMexicano();
        estrategiaSalida = new SalidaMexicano();
    }

}
