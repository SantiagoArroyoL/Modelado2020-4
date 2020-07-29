package ciencias.unam.modelado;

public interface Observador {
    public String getNombre();
    public void notificaAgregado(String nombre);
    public void notificaMensaje(String nombre, String mensaje);
    public void notificaEliminado(String nombre);
}