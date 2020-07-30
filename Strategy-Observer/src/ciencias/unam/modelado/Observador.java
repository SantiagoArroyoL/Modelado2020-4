package ciencias.unam.modelado;

public interface Observador {
    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue agregado al chat
     * @param nombre El nombre del usuario agregado
     */
    public void notificaAgregado(String nombre);

    /**
     * Método que imprime por terminal un mensaje mandado por otro usuario
     * Además el mensaje se incluye el nombre del mensajero
     * @param nombre Nombre del usuario que mandó el mensaje
     * @param mensaje EL mensaje a imprimir
     */
    public void notificaMensaje(String nombre, String mensaje);

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue eliminado del chat
     * @param nombre Nombre del usuario eliminado
     */
    public void notificaEliminado(String nombre);
}