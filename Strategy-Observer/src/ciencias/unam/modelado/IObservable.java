package ciencias.unam.modelado;

public interface IObservable {
    /**
     * Método encargado de agregar los observadores a la lista y notificar a los observadores
     * @param usuario El nuevo observador a ser registrado
     */
    public void registraObservador(Usuario usuario);

    /**
     * Método encargado de eliminar un observador de la lista y notificar al resto de su salida
     * @param usuario El observador a eliminar del registro
     */
    public void eliminaObservador(Usuario usuario);

    /**
     * Método que notifica a los observadores de un mensaje mandado
     * @param remitente El nombre del usuario que mandó el mensaje
     * @param mensaje El mensaje mandado por el usuario
     */
    public void notificarMensaje(String remitente, String mensaje);

    /**
     * Método que notifica al resto de observadores la llegada de un nuevo usuario al chat
     * @param remitente El nombre del nuevo usuario
     */
    public void notificarLlegadaUsuario(String remitente);

    /**
     * Método que notifica al resto de observadores la salida de un usuario del chat
     * @param remitente EL nombre del usuario a salir
     */
    public void notificarSalidaUsuario(String remitente);
}
