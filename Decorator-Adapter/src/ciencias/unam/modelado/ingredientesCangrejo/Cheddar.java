package ciencias.unam.modelado.ingredientesCangrejo;

public class Cheddar implements Queso{

    /* Costo del queso cheddar */
    private final float costo = 15;
    /* Descripción */
    private final String nombre = "Cheddar";

    /**
     * Regresa el valor monetario del queso
     *
     * @return Número flotante (que puede ser entero) que indica el costo del queso
     */
    @Override
    public float getCostoQueso() {
        return costo;
    }

    /**
     * Regresa la descripción del queso, ya sea el nombre o algo más detallado
     *
     * @return Cadena conteniendo la descripción
     */
    @Override
    public String getDescripcionQueso() {
        return nombre;
    }
}
