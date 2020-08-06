package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public abstract class IngredienteDecorator {
    protected Comida comida;
    protected double costo;

    public IngredienteDecorator(Comida comida){
        this.comida = comida;
    }
    
    public abstract String getDescripcion();

    public String getCosto() {
        return comida.getDescripcion()+ this.costo;
    }
}
