package ciencias.unam.modelado.componentes.motores;

/**
 *
 * Clase concreta del motor deportivo
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Motor
 * @since 15-08-2020
 */
public class Deportivo extends Motor {

    /**
     * Le damos valores arbitrarios al motor y llamamos al constructor del padre
     */
    public Deportivo() {
        super("Deportivo", 500,10,-1,10);
    }
    
}