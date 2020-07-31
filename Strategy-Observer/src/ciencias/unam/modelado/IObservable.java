package ciencias.unam.modelado;

/**
 *
 * Interfaz que define el comportamiento del observador
 * El observador será el encargado de mantener registro de los observadores,
 *  cada que uno mande un mensaje, entre o salga del chat le notificará al Observable y este le notificará
 *  al resto de observables
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 30-07-2020
 */
public interface IObservable {
    /**
     * Método encargado de agregar los observadores a la lista y notificar a los observadores
     * @param usuario El nuevo observador a ser registrado
     */
    public void registraObservador(Observador usuario);

    /**
     * Método encargado de eliminar un observador de la lista y notificar al resto de su salida
     * @param usuario El observador a eliminar del registro
     */
    public void eliminaObservador(Observador usuario);

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
