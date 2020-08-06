package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Cebolla extends IngredienteDecorator {

    public Cebolla(Comida comida) {
        super(comida);       
        this.costo = 8.7;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Cebolla $"+this.costo;
    }
    
}