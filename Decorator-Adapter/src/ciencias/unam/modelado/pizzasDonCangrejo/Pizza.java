package ciencias.unam.modelado.pizzasDonCangrejo;

import ciencias.unam.modelado.pizzasDonCangrejo.carne.Carne;
import ciencias.unam.modelado.pizzasDonCangrejo.masa.Masa;
import ciencias.unam.modelado.pizzasDonCangrejo.queso.Queso;

/**
 *
 * Clase abstracta que representa el antiguo modelo de las pizzas de don cangrejo.
 * Las pizzas están conformadas por un tipo de Carne, un tipo de Queso y un tipo de Masa.
 * En el constructor asignamos qué tipo de cada uno será y eso creará una pizza concreta
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Carne
 * @see Queso
 * @see Masa
 * @since 06-08-2020
 */
public abstract class Pizza {
    private Carne carne;
    private Queso queso;
    private Masa masa;
    
    /**
     * Es el constructor de la clase y sirve para reutilizar algunas lineas de código
     *   en la definición de los tipos de pizza
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
     * Es un método que devuelve el tipo de carne que contiene la pizza
     * @return  Un objeto de tipo Carne que encapsula un nombre para describirlo y su costo
     */
    public Carne getCarne() {
        return carne;
    }

    /**
     * Es un método que devuelve el tipo de masa que contiene la pizza
     * @return  Un objeto de tipo Masa que encapsula un nombre para describirlo y su costo
     */
    public Masa getMasa() {
        return masa;
    }

    /**
     * Es un método que devuelve el tipo de queso que contiene la pizza
     * @return  Un objeto de tipo Queso que encapsula un nombre para describirlo y su costo
     */
    public Queso getQueso() {
        return queso;
    }

}
