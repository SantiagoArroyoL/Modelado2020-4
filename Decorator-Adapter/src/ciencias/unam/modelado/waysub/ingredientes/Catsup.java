package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public class Catsup extends IngredienteDecorator {

    public Catsup(Comida comida) {
        super(comida);
        this.costo = 3.5;
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion()+", Catsup "+this.costo;
    }
}