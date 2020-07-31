package ciencias.unam.modelado;

import ciencias.unam.modelado.estrategias.mensaje.IEstrategiaMensaje;
import ciencias.unam.modelado.estrategias.salida.IEstrategiaSalida;
import ciencias.unam.modelado.estrategias.saludo.IEstrategiaSaludo;

/**
 *
 * Clase abstracta que definirá el comportamiento de los observadores (usuarios,miembros) del chat.
 * Los usuarios tienen un atributo chat y mediante este recibirán y mandarán mensajes.
 * Las diferentes estrategias definirán el idioma en el cual el usuario se comunica.
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Observador
 * @since 30-07-2020
 */
public abstract class Usuario implements Observador {

    /* Nombre del usuario */
    protected String nombre;
    /* Chat al que será agregado el usuario */
    protected Chat chat;
    /* La estrategia que define cómo se le avisa al usuario la llegada de uno nuevo */
    protected IEstrategiaSaludo estrategiaSaludo;
    /* La estrategia que define cómo le llega un mensaje al usuario */
    protected IEstrategiaMensaje estrategiaMensaje;
    /* La estrategia que define cómo se le avisa al usuario la salida ed otro */
    protected IEstrategiaSalida estrategiaSalida;

    /**
     * Constructor del usuario
     * Inicializa al usuario y lo agrega a un chat
     * @param chat El chat donde será agegado nuestro usuario
     */
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

    /**
     * Método que permite al usuario mandar un mensaje
     * @param mensaje Mensaje a mandar
     */
    public void enviarMensaje(String mensaje) {
        chat.notificarMensaje(nombre, mensaje);
    }

    /**
     * Regresa el nombre del usuario
     * @return El nombre del usuario
     */
    @Override
    public String getNombre() {
        return nombre;
    }
}
