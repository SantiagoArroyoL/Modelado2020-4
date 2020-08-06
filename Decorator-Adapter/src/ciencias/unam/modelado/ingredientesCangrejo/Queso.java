package ciencias.unam.modelado.ingredientesCangrejo;

public interface Queso {
    /**
     * Regresa el valor monetario del queso
     * @return Número flotante (que puede ser entero) que indica el costo del queso
     */
    public float getCostoQueso();

    /**
     * Regresa la descripción del queso, ya sea el nombre o algo más detallado
     * @return Cadena conteniendo la descripción
     */
    public String getDescripcionQueso();
}
