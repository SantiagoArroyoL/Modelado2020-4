package ciencias.unam.modelado.estrategias.mensaje;

/**
 *
 * Estrategia para que se muestre el mensaje recibido por el usuario en algún chat
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 30-07-2020
 */
public interface IEstrategiaMensaje {

    /**
     * Este método mostrará en terminal el nombre del usuario que recibe el mensaje
     * seguido del nombre del remitente y el mensaje tal cual fue escrito
     * @param destinatario Nombre del usuario que recibe el mensaje
     * @param remitente Nombre del usuario que mandó el mensaje
     * @param mensaje Texto del mensaje tal cual fue escrito
     */
    public void muestraMensaje(String destinatario, String remitente, String mensaje);
}
