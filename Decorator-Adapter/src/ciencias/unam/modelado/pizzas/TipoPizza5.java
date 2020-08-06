package ciencias.unam.modelado.pizzas;

import ciencias.unam.modelado.Pizza;
import ciencias.unam.modelado.ingredientesCangrejo.*;

public class TipoPizza5 extends Pizza {

    public TipoPizza5() {
        super.carne = new Salchicha();
        super.masa = new Gruesa();
        super.queso = new Manchego();
    }
}
