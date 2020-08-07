package ciencias.unam.modelado;

/**
 *
 * Interfaz que indica qué sistema debe tener cada platillo del restaurante
 * Cada platillo tendrá una descripción que indica los ingredientes que trae y el costo de cada uno
 * Además del costo total, que será la suma de dichos ingredientes
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 06-08-2020
 */
public interface Comida {

    /**
     * Método que da la descripción de la pizza, indicando qué carne, masa y queso contiene además
     *   del costo de cada ingrediente
     * @return Cadena con la descripción
     */
    public String getDescripcion();

    /**
     * Método que regresa el costo de la pizza
     * Sumamos el costo de cada ingrediente para obtener el costo total
     * @return La suma del costo de la carne, la masa y el queso de la Pizza
     */
    public double getCosto();
}
