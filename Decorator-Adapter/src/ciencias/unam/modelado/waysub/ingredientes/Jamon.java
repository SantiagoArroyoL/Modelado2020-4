package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Jamon extends IngredienteDecorator {

    public Jamon(Comida comida) {
        super(comida);
        this.costo = 13.45;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Jamon $"+this.costo;
    }
    
}