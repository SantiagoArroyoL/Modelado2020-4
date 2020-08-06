package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Pepperoni extends IngredienteDecorator {

    public Pepperoni(Comida comida) {
        super(comida);
        this.costo = 3499;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Pepperoni $"+this.costo;
    }
    
}