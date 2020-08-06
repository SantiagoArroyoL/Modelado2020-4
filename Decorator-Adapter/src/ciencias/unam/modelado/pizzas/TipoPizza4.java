package ciencias.unam.modelado.pizzas;

import ciencias.unam.modelado.Pizza;
import ciencias.unam.modelado.ingredientesCangrejo.*;

public class TipoPizza4 extends Pizza {

    public TipoPizza4() {
        super.carne = new Pollo();
        super.masa = new Delgada();
        super.queso = new Manchego();
    }
}
