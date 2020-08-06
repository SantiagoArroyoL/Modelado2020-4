package ciencias.unam.modelado.pizzasDonCangrejo;

import ciencias.unam.modelado.pizzasDonCangrejo.carne.Carne;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Masa;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Queso;

public abstract class Pizza {
    private Carne carne;
    private Queso queso;
    private Masa masa;
    
    /**
     * Es el contructor de la clase y 
     * sirve para reutilizar algunas lineas de codigo
     * en la definicion de los tipos de pizza
     * @param carne El tipo de carne que tiene la pizza
     * @param queso El tipo de queso que tiene la pizza
     * @param masa El tipo de masa que tiene la pizza
     */
    protected Pizza(Carne carne, Queso queso, Masa masa){
        this.carne = carne;
        this.queso = queso;
        this.masa = masa;
    }

    /**
     * Es un metodo que devuelve el tipo de carne
     * que contiene la pizza
     * @return  Un objeto de tipo Carne que encapsula
     * un nombre para describirlo y su costo
     */
    public Carne getCarne() {
        return carne;
    }
    /**
     * Es un metodo que devuelve el tipo de masa
     * que contiene la pizza
     * @return  Un objeto de tipo Masas que encapsula
     * un nombre para describirlo y su costo
     */
    public Masa getMasa() {
        return masa;
    }
    /**
     * Es un metodo que devuelve el tipo de queso
     * que contiene la pizza
     * @return  Un objeto de tipo Queso que encapsula
     * un nombre para describirlo y su costo
     */
    public Queso getQueso() {
        return queso;
    }

}
