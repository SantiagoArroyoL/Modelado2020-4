package ciencias.unam.modelado.pizzas;

import ciencias.unam.modelado.Pizza;
import ciencias.unam.modelado.ingredientesCangrejo.*;

public class TipoPizza3 extends Pizza {

    public TipoPizza3() {
        super.carne = new Jamon();
        super.masa = new Delgada();
        super.queso = new Cheddar();
    }
}