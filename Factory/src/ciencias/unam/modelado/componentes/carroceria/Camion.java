package ciencias.unam.modelado.componentes.carroceria;

/**
 *
 * Clase concreta de la carroceria de camion
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Carroceria
 * @since 15-08-2020
 */
public class Camion extends Carroceria {

    /**
     * Le damos valores arbitrarios a la carrocería y llamamos al constructor del padre
     */
    public Camion() {
        super("Camion", 500,8,8,1);
    }
    
}