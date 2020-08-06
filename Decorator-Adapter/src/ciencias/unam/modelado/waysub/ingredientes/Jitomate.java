package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Jitomate extends IngredienteDecorator {

    public Jitomate(Comida comida) {
        super(comida);
        this.costo = 15.56;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Jitomate $"+this.costo;
    }
    
}