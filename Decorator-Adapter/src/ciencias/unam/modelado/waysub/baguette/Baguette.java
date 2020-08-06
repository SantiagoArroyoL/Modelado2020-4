package ciencias.unam.modelado.waysub.baguette;

import ciencias.unam.modelado.Comida;

public abstract class Baguette implements Comida{
    /**
     * Regresa las descripción del pan
     * @return Cadena conteniendo el nombre o descripción del pan
     */
    public abstract String getDescripcion();

    /**
     * Regresa el costo del pan
     * @return Regresa el costo flotante (puede ser entero) del pan
     */
    public abstract double getCosto();

}
