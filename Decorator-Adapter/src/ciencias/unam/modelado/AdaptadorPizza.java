package ciencias.unam.modelado;

import ciencias.unam.modelado.pizzas.*;

public class AdaptadorPizza implements Comida {

    private Pizza pizza;

    public AdaptadorPizza(int n) {
        if (n < 1 || n > 5)
            throw new IllegalArgumentException("Por favor introduce un tipo válido de Pizza");
        switch (n) {
            case 1: pizza = new TipoPizza1();
            case 2: pizza = new TipoPizza2();
            case 3: pizza = new TipoPizza3();
            case 4: pizza = new TipoPizza4();
            case 5: pizza = new TipoPizza5();
        }
    }

    @Override
    public String getTicket() {
        String ticket = "Aquí tiene el ticket de su Pizza";
        ticket += "\nLa carne de su pizza es: " + pizza.getCarne().getDescripcionCarne();
        ticket += "\nEl queso de su pizza es: " + pizza.getQueso().getDescripcionQueso();
        ticket += "\nLa masa de su pizza es: " + pizza.getMasa().getDescripcionMasa();
        ticket += "\n\t\tEl costo Total es: " + getCosto();
        return ticket;
    }

    @Override
    public float getCosto() {
        return pizza.getCarne().getCostoCarne() + pizza.getMasa().getCostoMasa() + pizza.getQueso().getCostoQueso();
    }

}
