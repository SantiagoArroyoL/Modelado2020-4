package ciencias.unam.modelado;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;

/**
 *
 * Adaptador encargado de hacer posible la implementación de la interfaz comida en la clase Pizza
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comida
 * @since 06-08-2020
 */
public class AdaptadorPizzaCangrejo implements Comida {

    /* Indica qué tipo de Pizza es */
    private Pizza pizza;

    /**
     * Constructor del adaptador
     * @param pizza Indicamos qué tipo de pizza adaptaremos
     */
    public AdaptadorPizzaCangrejo(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Método que da la descripción de la pizza, indicando qué carne, masa y queso contiene además
     *   del costo de cada ingrediente
     * @return Cadena con la descripción
     */
    @Override
    public String getDescripcion() {
        String ticket = pizza.getCarne().getDescripcionCarne() + " $"+  pizza.getCarne().getCostoCarne() + ", ";
        ticket += pizza.getMasa().getDescripcionMasa() + " $"+  pizza.getMasa().getCostoMasa() + ", ";
        ticket += pizza.getQueso().getDescripcionQueso() + " $"+  pizza.getQueso().getCostoQueso();
        return ticket;
    }

    /**
     * Método que regresa el costo de la pizza
     * Sumamos el costo de cada ingrediente para obtener el costo total
     * @return La suma del costo de la carne, la masa y el queso de la Pizza
     */
    @Override
    public double getCosto() {
        return pizza.getCarne().getCostoCarne() + pizza.getMasa().getCostoMasa() + pizza.getQueso().getCostoQueso();
    }

}
