package ciencias.unam.modelado.ingredientesCangrejo;

public class Pollo implements Carne {

    /* Costo del pollo */
    private final float costo = 5;
    /* Descripción */
    private final String nombre = "Pollo";

    /**
     * Regresa el valor monetario de la carne
     *
     * @return Número flotante (que puede ser entero) que indica el cost de la carne
     */
    @Override
    public float getCostoCarne() {
        return costo;
    }

    /**
     * Regresa la descripción de la carne, ya sea el nombre o algo más detallado
     *
     * @return Cadena conteniendo la descripción
     */
    @Override
    public String getDescripcionCarne() {
        return nombre;
    }
}
