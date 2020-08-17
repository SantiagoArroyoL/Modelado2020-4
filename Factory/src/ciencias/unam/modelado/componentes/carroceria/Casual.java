package ciencias.unam.modelado.componentes.carroceria;

/**
 *
 * Clase concreta de la carroceria casual
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Carroceria
 * @since 15-08-2020
 */
public class Casual extends Carroceria {

    /**
     * Le damos valores arbitrarios a la carrocería y llamamos al constructor del padre
     */
    public Casual() {
        super("Casual", 25.89,4,5,4);
    }
    
}