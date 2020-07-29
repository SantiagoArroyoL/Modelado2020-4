package ciencias.unam.modelado;

public class Mexicano implements Observador{

    private String nombre;

    public Mexicano(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificaAgregado(String nombre) {
        System.out.println(this.nombre + ": Chale, " + nombre + " fue agregado al chat");
    }

    @Override
    public void notificaMensaje(String nombre, String mensaje) {
        System.out.println(this.nombre + ": Chale, " + nombre + " escribió el mensaje: " + mensaje);
    }

    @Override
    public void notificaEliminado(String nombre) {
        System.out.println(this.nombre + ": Chale, " + nombre + " fue eliminado del chat");
    }
}
