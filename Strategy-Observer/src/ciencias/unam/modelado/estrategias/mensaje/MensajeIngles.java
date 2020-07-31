package ciencias.unam.modelado.estrategias.mensaje;

/**
 *
 * Estrategia para que se muestre el mensaje recibido por el usuario Ingles en algún chat
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see IEstrategiaMensaje
 * @since 30-07-2020
 */
public class MensajeIngles implements IEstrategiaMensaje {

    /**
     * Este método mostrará en terminal el nombre del usuario que recibe el mensaje
     * seguido del nombre del remitente y el mensaje tal cual fue escrito
     * @param destinatario Nombre del usuario que recibe el mensaje
     * @param remitente Nombre del usuario que mandó el mensaje
     * @param mensaje Texto del mensaje tal cual fue escrito
     */
    @Override
    public void muestraMensaje(String destinatario, String remitente, String mensaje) {
        System.out.println(destinatario+":"+ "("+remitente+" has sent a message)"+mensaje);
    }
}
