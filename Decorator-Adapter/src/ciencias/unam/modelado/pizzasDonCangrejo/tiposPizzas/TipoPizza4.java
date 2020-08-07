package ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;
import ciencias.unam.modelado.pizzasDonCangrejo.carne.Pollo;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Delgada;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Manchego;

/**
 * Clase concreta de una Pizza con Pollo, Manchego y masa delgada
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Pizza
 * @since 06-08-2020
 */
public class TipoPizza4 extends Pizza {

    /**
     * Es un constructor que define mediante la llamada al constructor
     *   del padre los ingredientes de este tipo de pizza
     */
    public TipoPizza4() {
        super(new Pollo(), new Manchego(), new Delgada());
    }
}
