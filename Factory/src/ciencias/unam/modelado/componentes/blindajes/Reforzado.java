package ciencias.unam.modelado.componentes.blindajes;

/**
 *
 * Clase concreta del blindaje reforzado
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Blindaje
 * @since 15-08-2020
 */
public class Reforzado extends Blindaje {

    /**
     * Le damos valores arbitrarios al blindaje y llamamos al constructor del padre
     */
    public Reforzado() {
        super("Reforzado", 150,5,8,3);
    }
    
}