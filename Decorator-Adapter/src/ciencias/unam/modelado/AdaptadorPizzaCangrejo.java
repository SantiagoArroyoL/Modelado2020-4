package ciencias.unam.modelado;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;

public class AdaptadorPizzaCangrejo implements Comida {

    private Pizza pizza;

    public AdaptadorPizzaCangrejo(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescripcion() {
        String ticket = pizza.getCarne().getDescripcionCarne() + " $"+  pizza.getCarne().getCostoCarne() + ", ";
        ticket += pizza.getMasa().getDescripcionMasa() + " $"+  pizza.getMasa().getDescripcionMasa() + ", ";
        ticket += pizza.getQueso().getDescripcionQueso() + " $"+  pizza.getQueso().getCostoQueso();
        return ticket;
    }

    @Override
    public double getCosto() {
        return pizza.getCarne().getCostoCarne() + pizza.getMasa().getCostoMasa() + pizza.getQueso().getCostoQueso();
    }

}
