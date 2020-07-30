package ciencias.unam.modelado;

import java.util.LinkedList;

public class Chat implements Observable {

    private LinkedList<Observador> registro;

    /**
     * Constructor del Chat que inicializa el registro
     */
    public Chat() {
        registro = new LinkedList<>();
    }

    /**
     * Método encargado de agregar los observadores a la lista y notificar a los observadores
     *
     * @param observador El nuevo observador a ser registrado
     */
    @Override
    public void registraObservador(Observador observador) {

    }

    /**
     * Método encargado de eliminar un observador de la lista y notificar al resto de su salida
     *
     * @param observador El observador a eliminar del registro
     */
    @Override
    public void eliminaObservador(Observador observador) {

    }

    /**
     * Método que notifica a los observadores de un mensaje mandado
     *
     * @param usuario El nombre del usuario que mandó el mensaje
     * @param mensaje El mensaje mandado por el usuario
     */
    @Override
    public void notificarMensaje(String usuario, String mensaje) {

    }

    /**
     * Método que notifica al resto de observadores la llegada de un nuevo usuario al chat
     *
     * @param usuario El nombre del nuevo usuario
     */
    @Override
    public void notificarLlegadaUsuario(String usuario) {
        for (Observador o : registro) {
            o.notificaAgregado(usuario);
        }
    }

    /**
     * Método que notifica al resto de observadores la salida de un usuario del chat
     *
     * @param usuario EL nombre del usuario a salir
     */
    @Override
    public void notificarSalidaUsuario(String usuario) {
        for (Observador o : registro) {
            o.notificaEliminado(usuario);
        }
    }

    public void agregarUsuario(Usuario usuario) {
        registro.add(usuario);
        notificarLlegadaUsuario(usuario.nombre);
    }

    public void enviarMensaje(String nombre, String mensaje) {
        // De todas maneras hay que hacerlo como dije según el diagrama XD
    }

    public void eliminarUsuario(Usuario usuario) {
        registro.remove(usuario);
        notificarSalidaUsuario(usuario.nombre);
    }
}
