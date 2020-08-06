package ciencias.unam.modelado.baguette;

public class Blanco implements Baguette {

    /**
     * Regresa las descripción del pan
     *
     * @return Cadena conteniendo el nombre o descripción del pan
     */
    @Override
    public String getDescripcion() {
        return "El pan elegido es pan Blanco";
    }

    /**
     * Regresa el costo del pan
     *
     * @return Regresa el costo flotante (puede ser entero) del pan
     */
    @Override
    public float costo() {
        return 1;
    }
}
