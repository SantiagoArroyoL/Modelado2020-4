package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

public abstract class IngredienteDecorator implements Comida {
    protected Comida comida;
    protected double costo;

    /**
     * Supercontructor que encapsula una objeto de la clase comida, 
     * para que siguiendo el patron de diseno decorator, extienda la
     * funcionalidad de la clas de comida
     * @param comida Objeto de la clase comida a la que quiera extender su funcionalidad
     */
    public IngredienteDecorator(Comida comida){
        this.comida = comida;
    }
    /**
     * Regresa las descripcion del ingrediente mediante 
     * una cadena que muestra el nombre y el costo
     * 
     * @return Cadena conteniendo el nombre o descripcion del ingrediente
     */
    public abstract String getDescripcion();

    /**
     * Realiza una implementacion generica
     * donde se extiende la funcionalidad del objeto encapsulado comida,
     * el atributo costo se inicializa en las subclases
     */
    public double getCosto() {
        return comida.getCosto() + this.costo;
    }
}
