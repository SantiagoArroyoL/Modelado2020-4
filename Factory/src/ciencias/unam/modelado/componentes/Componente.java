package ciencias.unam.modelado.componentes;

/**
 *
 * Clase abstracta encargada de encapsular el comportamiento de cada componente del Coche.
 * Los componentes tendrán un costo y además añadirán un valor entero a
 *    los atributos de defensa, ataque y velocidad del coche
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 15-08-2020
 */
public abstract class Componente {

    protected String nombre;
    protected double costo;
    protected int ataque; 
    protected int defensa;
    protected int velocidad;

    /**
     * Constructor del motor
     * Todos los componentes llamarán a este constructor, es decir todas las clases que
     *   hereden esta clase tendrán que usar este constructor
     * @param nombre El nombre que tendrá el componente
     * @param costo El costo (Número double) que tendrá el componente
     * @param ataque Cuánto añade de ataque el componente al coche
     * @param defensa Cuánto añade de defensa el componente al coche
     * @param velocidad Cuánto velocidad añade el componente al coche
     */
    public Componente(String nombre, double costo, int ataque, int defensa, int velocidad){
        this.nombre = nombre;
        this.costo = costo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    /**
     * Nos da el costo del componente
     * @return El double que contiene el precio del componente
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Regresa el ataque que añade el componente al coche
     * @return El valor entero del ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Regresa la defensa que añade el componente al coche
     * @return El valor entero de la defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Regresa el nombre del componente
     * @return El nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa la velocidad que añade el componente al coche
     * @return El valor entero de la velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
}
