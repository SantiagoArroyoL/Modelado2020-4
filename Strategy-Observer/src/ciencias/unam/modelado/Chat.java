package ciencias.unam.modelado;

import java.util.LinkedList;

public class Chat implements IObservable {

    private LinkedList<Usuario> observadores;

    /**
     * Constructor del Chat que inicializa el registro
     */
    public Chat() {
        observadores = new LinkedList<>();
    }

    /**
     * Método encargado de agregar los observadores a la lista y notificar a los observadores
     *
     * @param observador El nuevo observador a ser registrado
     */
    @Override
    public void registraObservador(Usuario usuario) {
        observadores.add(usuario);
        notificarLlegadaUsuario(usuario.getNombre());
    }

    /**
     * Método encargado de eliminar un observador de la lista y notificar al resto de su salida
     *
     * @param observador El observador a eliminar del registro
     */
    @Override
    public void eliminaObservador(Usuario usuario) {
        observadores.remove(usuario);
        notificarSalidaUsuario(usuario.getNombre());
    }

    /**
     * Método que notifica a los observadores de un mensaje mandado
     *
     * @param remitente El nombre del usuario que mandó el mensaje
     * @param mensaje El mensaje mandado por el usuario
     */
    @Override
    public void notificarMensaje(String remitente, String mensaje) {
        for (Usuario o : observadores) {
            o.notificaMensaje(remitente, mensaje);
        }
    }

    /**
     * Método que notifica al resto de observadores la llegada de un nuevo usuario al chat
     *
     * @param remitente El nombre del nuevo usuario
     */
    @Override
    public void notificarLlegadaUsuario(String remitente) {
        for (Usuario o : observadores) {
            o.notificaAgregado(remitente);
        }
    }

    /**
     * Método que notifica al resto de observadores la salida de un usuario del chat
     *
     * @param remitente EL nombre del usuario a salir
     */
    @Override
    public void notificarSalidaUsuario(String remitente) {
        for (Usuario o : observadores) {
            o.notificaEliminado(remitente);
        }
    }

}
