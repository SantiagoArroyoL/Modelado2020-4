package ciencias.unam.modelado.ingredientesCangrejo;

public class Gruesa implements Masa{

    /* Costo del jamón */
    private final float costo = 5;
    /* Descripción */
    private final String nombre = "Gruesa";

    /**
     * Regresa el valor monetario de la masa
     *
     * @return Número flotante (que puede ser entero) que indica el costo de la masa
     */
    @Override
    public float getCostoMasa() {
        return costo;
    }

    /**
     * Regresa la descripción de la masa, ya sea el nombre o algo más detallado
     *
     * @return Cadena conteniendo la descripción
     */
    @Override
    public String getDescripcionMasa() {
        return nombre;
    }
}
