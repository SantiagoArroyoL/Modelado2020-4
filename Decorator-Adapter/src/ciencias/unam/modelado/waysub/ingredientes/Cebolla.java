package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Cebolla extends IngredienteDecorator {
    /**
     * Constructor de la clase, llama al super constructor
     * para encapsular al objeto de la clase comida siguiendo
     * el patron de diseño del decorador, tambien  se inizializa 
     * la variable costo de acuerdo a este ingrediente en especifico
     */
    public Cebolla(Comida comida) {
        super(comida);       
        this.costo = 8.7;
    }
    /**
     * Regresa las descripción del ingrediente mediante 
     * una cadena que muestra el nombre y el costo
     * 
     * @return Cadena conteniendo el nombre o descripcion del ingrediente
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Cebolla $"+this.costo;
    }
    
}