package ciencias.unam.modelado.ingredientesCangrejo;

public interface Carne {
    /**
     * Regresa el valor monetario de la carne
     * @return Número flotante (que puede ser entero) que indica el cost de la carne
     */
    public float getCostoCarne();

    /**
     * Regresa la descripción de la carne, ya sea el nombre o algo más detallado
     * @return Cadena conteniendo la descripción
     */
    public String getDescripcionCarne();
}
