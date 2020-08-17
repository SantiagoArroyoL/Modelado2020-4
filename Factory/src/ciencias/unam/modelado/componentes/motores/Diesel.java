package ciencias.unam.modelado.componentes.motores;

/**
 *
 * Clase concreta del motor diesel
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Motor
 * @since 15-08-2020
 */
public class Diesel extends Motor{

    /**
     * Le damos valores arbitrarios al motor y llamamos al constructor del padre
     */
    public Diesel() {
        super("Diesel", 300,10,5,1);
    }
    
}