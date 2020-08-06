package ciencias.unam.modelado.pizzasDonCangrejo.masa;

public interface Masa {
    /**
     * Regresa el valor monetario de la masa
     * @return Número double (que puede ser entero) que indica el costo de la masa
     */
    public double getCostoMasa();

    /**
     * Regresa la descripción de la masa, ya sea el nombre o algo más detallado
     * @return Cadena conteniendo la descripción
     */
    public String getDescripcionMasa();
}
