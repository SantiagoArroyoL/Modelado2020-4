package ciencias.unam.modelado.ingredientesCangrejo;

public class Manchego implements Queso{

    /* Costo del queso Manchego */
    private final float costo = 15;
    /* Descripción */
    private final String nombre = "Manchego";

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
