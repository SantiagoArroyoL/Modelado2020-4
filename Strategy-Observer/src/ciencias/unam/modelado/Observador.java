package ciencias.unam.modelado;

/**
 *
 * Interfaz que define el comportamiento de los observadores (usuarios,miembros) del chat
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 30-07-2020
 */
public interface Observador {

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue agregado al chat
     * @param remitente El nombre del usuario agregado
     */
    public void notificaAgregado(String remitente);

    /**
     * Método que imprime por terminal un mensaje mandado por otro usuario
     * Además el mensaje se incluye el nombre del mensajero
     * @param remitente Nombre del usuario que mandó el mensaje
     * @param mensaje EL mensaje a imprimir
     */
    public void notificaMensaje(String remitente, String mensaje);

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue eliminado del chat
     * @param remitente Nombre del usuario eliminado
     */
    public void notificaEliminado(String remitente);

    /**
     * Regresa el nombre del usuario
     * @return El nombre del usuario
     */
    public String getNombre();

}