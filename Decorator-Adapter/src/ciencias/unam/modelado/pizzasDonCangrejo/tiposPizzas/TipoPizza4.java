package ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;
import ciencias.unam.modelado.pizzasDonCangrejo.carne.Pollo;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Delgada;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Manchego;

public class TipoPizza4 extends Pizza {
    /**
     * Es un constructor que define 
     * mediante la lllamada al constructor d
     * del padre los ingredientes de este tipo de pizza
     */
    public TipoPizza4() {
        super(new Pollo(), new Manchego(), new Delgada());
    }
}
