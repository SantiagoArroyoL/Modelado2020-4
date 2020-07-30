package ciencias.unam.modelado;

public abstract class Usuario implements Observador {

    /* Nombre del usuario*/
    public String nombre;
    public EstrategiaSaludo estrategiaSaludo;
    public EstrategiaMensaje estrategiaMensaje;
    public EstrategiaSalida estrategiaSalida;

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue agregado al chat
     *
     * @param nombre El nombre del usuario agregado
     */
    @Override
    public void notificaAgregado(String nombre) {
        estrategiaSaludo.muestraSaludo(nombre);
    }

    /**
     * Método que imprime por terminal un mensaje mandado por otro usuario
     * Además el mensaje se incluye el nombre del mensajero
     *
     * @param nombre  Nombre del usuario que mandó el mensaje
     * @param mensaje EL mensaje a imprimir
     */
    @Override
    public void notificaMensaje(String nombre, String mensaje) {
        estrategiaMensaje.muestraMensaje(nombre, mensaje);
    }

    /**
     * Método que imprime por terminal un aviso denotando que un usuario fue eliminado del chat
     *
     * @param nombre Nombre del usuario eliminado
     */
    @Override
    public void notificaEliminado(String nombre) {
        estrategiaSalida.muestraSalida(nombre);
    }
}
