package ciencias.unam.modelado.pizzas;

import ciencias.unam.modelado.Pizza;
import ciencias.unam.modelado.ingredientesCangrejo.*;

public class TipoPizza1 extends Pizza {

    public TipoPizza1() {
        super.carne = new Jamon();
        super.masa = new Delgada();
        super.queso = new Cheddar();
    }
}
