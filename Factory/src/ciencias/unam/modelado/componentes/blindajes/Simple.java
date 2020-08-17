package ciencias.unam.modelado.componentes.blindajes;

/**
 *
 * Clase concreta del blindaje simple
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Blindaje
 * @since 15-08-2020
 */
public class Simple extends Blindaje {

    /**
     * Le damos valores arbitrarios al blindaje y llamamos al constructor del padre
     */
    public Simple() {
        super("Simple", 25.23,5,0,10);
    }
    
}