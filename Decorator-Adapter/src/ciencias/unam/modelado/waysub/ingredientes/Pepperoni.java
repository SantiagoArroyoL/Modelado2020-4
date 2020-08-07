package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

/**
 * Ingrediente pepperoni
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see IngredienteDecorator
 * @since 06-08-2020
 */
public class Pepperoni extends IngredienteDecorator {
    /**
     * Constructor de la clase, llama al super constructor
     * para encapsular al objeto de la clase comida siguiendo
     * el patron de diseño del decorador, tambien  se inizializa 
     * la variable costo de acuerdo a este ingrediente en especifico
     */
    public Pepperoni(Comida comida) {
        super(comida);
        this.costo = 3499;
    }
    /**
     * Regresa las descripción del ingrediente mediante 
     * una cadena que muestra el nombre y el costo
     * 
     * @return Cadena conteniendo el nombre o descripción del ingrediente
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Pepperoni $"+this.costo;
    }
    
}