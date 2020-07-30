package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.IEstrategiaMensaje;
import ciencias.unam.modelado.estrategias.salida.IEstrategiaSalida;
import ciencias.unam.modelado.estrategias.saludo.IEstrategiaSaludo;

public abstract class Usuario implements Observador {

    /* Nombre del usuario*/
    protected String nombre;
    protected Chat chat;
    protected IEstrategiaSaludo estrategiaSaludo;
    protected IEstrategiaMensaje estrategiaMensaje;
    protected IEstrategiaSalida estrategiaSalida;

    public Usuario(Chat chat){
        this.chat = chat;
    }

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue agregado al chat
     *
     * @param remitente El nombre del usuario agregado
     */
    @Override
    public void notificaAgregado(String remitente) {
        if(!remitente.equals(nombre)){
            estrategiaSaludo.muestraSaludo(nombre, remitente);
        }
    }

    /**
     * Método que imprime por terminal un mensaje mandado por otro usuario
     * Además el mensaje se incluye el nombre del mensajero
     *
     * @param remitente  Nombre del usuario que mandó el mensaje
     * @param mensaje EL mensaje a imprimir
     */
    @Override
    public void notificaMensaje(String remitente, String mensaje) {
        if(!remitente.equals(nombre)){
            estrategiaMensaje.muestraMensaje(nombre, remitente, mensaje);
        }
    }

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue eliminado del chat
     *
     * @param remitente Nombre del usuario eliminado
     */
    @Override
    public void notificaEliminado(String remitente) {
        if(!remitente.equals(nombre)){
            estrategiaSalida.muestraSalida(nombre, remitente);
        }
    }

    public void enviarMensaje(String mensaje){
        chat.notificarMensaje(nombre, mensaje);
    }

    public String getNombre() {
        return nombre;
    }
}
