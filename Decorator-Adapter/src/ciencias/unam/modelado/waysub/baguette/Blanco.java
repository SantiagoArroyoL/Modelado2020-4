package ciencias.unam.modelado.waysub.baguette;

import ciencias.unam.modelado.Comida;

/**
 *
 * Clase qué indica que el sandwich tendrá pan Blanco
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comida
 * @since 06-08-2020
 */
public class Blanco extends Baguette {

    /**
     * Regresa las descripción del pan
     *
     * @return Cadena conteniendo el nombre o descripción del pan
     */
    @Override
    public String getDescripcion() {
        return "Pan Blanco $"+this.getCosto();
    }

    /**
     * Regresa el costo del pan
     *
     * @return Regresa el costo flotante (puede ser entero) del pan
     */
    @Override
    public double getCosto() {
        return 1;
    }
}
