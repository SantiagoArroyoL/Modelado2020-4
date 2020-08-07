package ciencias.unam.modelado.waysub.ingredientes;

import ciencias.unam.modelado.Comida;

/**
 * Clase que engloba los ingredientes del sandwich
 * Cada uno de ellos funcionará como un decorador, agregando el costo de cada ingrediente al costo total
 * Análogamente cada ingrediente se agregará a la descripción del platillo
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comida
 * @since 06-08-2020
 */
public abstract class IngredienteDecorator implements Comida {

    /* Platillo base */
    protected Comida comida;
    /* Costo del ingrediente */
    protected double costo;

    /**
     * Superconstructor que encapsula una objeto de la clase comida, para que siguiendo el patron de diseño decorator,
     *    extienda la funcionalidad de la clase de comida
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
