package ciencias.unam.modelado.pizzasDonCangrejo.carne;

public class Salchicha implements Carne{

    /**
     * Regresa el valor monetario de la carne
     *
     * @return Número flotante (que puede ser entero) que indica el cost de la carne
     */
    @Override
    public double getCostoCarne() {
        return 13.99;
    }

    /**
     * Regresa la descripción de la carne, ya sea el nombre o algo más detallado
     *
     * @return Cadena conteniendo la descripción
     */
    @Override
    public String getDescripcionCarne() {
        return "Salchicha";
    }
}
