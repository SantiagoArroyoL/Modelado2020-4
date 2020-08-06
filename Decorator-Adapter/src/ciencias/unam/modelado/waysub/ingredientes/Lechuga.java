package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Lechuga extends IngredienteDecorator {

    public Lechuga(Comida comida) {
        super(comida);
        this.costo = 10;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Lechuga $"+this.costo;
    }
    
}