package ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;
import ciencias.unam.modelado.pizzasDonCangrejo.carne.Salchicha;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Gruesa;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Cheddar;

/**
 * Clase concreta de una Pizza con Salchicha, Cheddar y masa gruesa
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Pizza
 * @since 06-08-2020
 */
public class TipoPizza2 extends Pizza {

    /**
     * Es un constructor que define mediante la llamada al constructor
     *   del padre los ingredientes de este tipo de pizza
     */
    public TipoPizza2() {
        super(new Salchicha(), new Cheddar(), new Gruesa());
    }
}