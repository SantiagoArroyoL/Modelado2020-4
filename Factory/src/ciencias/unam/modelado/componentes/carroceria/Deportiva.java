package ciencias.unam.modelado.componentes.carroceria;

/**
 *
 * Clase concreta de la carroceria deportiva
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Carroceria
 * @since 15-08-2020
 */
public class Deportiva extends Carroceria {

    /**
     * Le damos valores arbitrarios a la carrocería y llamamos al constructor del padre
     */
    public Deportiva() {
        super("Deportiva", 600,5,1,15);
    }
    
}