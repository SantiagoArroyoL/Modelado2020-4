package ciencias.unam.modelado.ingredientesCangrejo;

public class Salchicha implements Carne{

    /* Costo de la salchicha */
    private final float costo = 13.99f;
    /* Descripción */
    private final String nombre = "Salchicha";

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
