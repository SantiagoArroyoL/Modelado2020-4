package ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;
import ciencias.unam.modelado.pizzasDonCangrejo.carne.Salchicha;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Gruesa;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Manchego;

public class TipoPizza5 extends Pizza {
    /**
     * Es un constructor que define 
     * mediante la lllamada al constructor d
     * del padre los ingredientes de este tipo de pizza
     */
    public TipoPizza5() {
        super(new Salchicha(), new Manchego(), new Gruesa());
    }
}
