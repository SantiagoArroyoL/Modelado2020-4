package ciencias.unam.modelado.pizzasDonCangrejo.masa;

public class Gruesa implements Masa{

    /**
     * Regresa el valor monetario de la masa
     *
     * @return Número flotante (que puede ser entero) que indica el costo de la masa
     */
    @Override
    public double getCostoMasa() {
        return 5;
    }

    /**
     * Regresa la descripción de la masa, ya sea el nombre o algo más detallado
     *
     * @return Cadena conteniendo la descripción
     */
    @Override
    public String getDescripcionMasa() {
        return "Masa gruesa";
    }
}
