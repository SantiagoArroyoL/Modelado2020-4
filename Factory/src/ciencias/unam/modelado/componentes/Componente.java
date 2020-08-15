package ciencias.unam.modelado.componentes;

public abstract class Componente {
    protected String nombre;
    protected double costo;
    protected int ataque; 
    protected int defensa;
    protected int velocidad;

    public Componente(String nombre, double costo){
        this.nombre = nombre;
        this.costo = costo; 
    }

    public double getCosto() {
        return costo;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
