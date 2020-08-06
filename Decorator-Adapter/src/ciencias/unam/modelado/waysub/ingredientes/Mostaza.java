package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Mostaza extends IngredienteDecorator {

    public Mostaza(Comida comida) {
        super(comida);
        this.costo = 1;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Mostaza $"+this.costo;
    }
    
}