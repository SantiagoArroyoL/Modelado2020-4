package ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;
import ciencias.unam.modelado.pizzasDonCangrejo.carne.Jamon;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Delgada;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Cheddar;

/**
 * Clase concreta de una Pizza con Jamón, Cheddar y masa delgada
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Pizza
 * @since 06-08-2020
 */
public class TipoPizza1 extends Pizza {

    /**
     * Es un constructor que define mediante la llamada al constructor
     *   del padre los ingredientes de este tipo de pizza
     */
    public TipoPizza1() {
        super(new Jamon(), new Cheddar(), new Delgada());
    }
}
