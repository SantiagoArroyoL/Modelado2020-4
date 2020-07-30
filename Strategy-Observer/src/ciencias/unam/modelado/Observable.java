package ciencias.unam.modelado;

public interface Observable {
    /**
     * Método encargado de agregar los observadores a la lista y notificar a los observadores
     * @param observador El nuevo observador a ser registrado
     */
    public void registraObservador(Observador observador);

    /**
     * Método encargado de eliminar un observador de la lista y notificar al resto de su salida
     * @param observador El observador a eliminar del registro
     */
    public void eliminaObservador(Observador observador);

    /**
     * Método que notifica a los observadores de un mensaje mandado
     * @param usuario El nombre del usuario que mandó el mensaje
     * @param mensaje El mensaje mandado por el usuario
     */
    public void notificarMensaje(String usuario, String mensaje);

    /**
     * Método que notifica al resto de observadores la llegada de un nuevo usuario al chat
     * @param usuario El nombre del nuevo usuario
     */
    public void notificarLlegadaUsuario(String usuario);

    /**
     * Método que notifica al resto de observadores la salida de un usuario del chat
     * @param usuario EL nombre del usuario a salir
     */
    public void notificarSalidaUsuario(String usuario);
}
