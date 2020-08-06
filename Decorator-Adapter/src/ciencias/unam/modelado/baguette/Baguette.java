package ciencias.unam.modelado.baguette;

public interface Baguette {
    /**
     * Regresa las descripción del pan
     * @return Cadena conteniendo el nombre o descripción del pan
     */
    public String getDescripcion();

    /**
     * Regresa el costo del pan
     * @return Regresa el costo flotante (puede ser entero) del pan
     */
    public float costo();

}
