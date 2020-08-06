package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Mayonesa extends IngredienteDecorator {

    public Mayonesa(Comida comida) {
        super(comida);
        this.costo = 100;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Mayonesa $"+this.costo;
    }
    
}