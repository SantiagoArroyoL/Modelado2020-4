package ciencias.unam.modelado.componentes.blindajes;

/**
 *
 * Clase concreta del blindaje tanque
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Blindaje
 * @since 15-08-2020
 */
public class Tanque extends Blindaje {

    /**
     * Le damos valores arbitrarios al blindaje y llamamos al constructor del padre
     */
    public Tanque() {
        super("Tanque", 300,10,10,-4);
    }
    
}