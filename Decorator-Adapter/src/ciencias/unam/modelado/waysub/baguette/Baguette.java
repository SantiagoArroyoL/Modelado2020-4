package ciencias.unam.modelado.waysub.baguette;

import ciencias.unam.modelado.Comida;

/**
 *
 * Clase qué indica qué tipo de pan tendrá el sandwich
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comida
 * @since 06-08-2020
 */
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
