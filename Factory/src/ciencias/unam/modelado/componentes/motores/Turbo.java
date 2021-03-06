package ciencias.unam.modelado.componentes.motores;

/**
 *
 * Clase concreta del motor turbo
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Motor
 * @since 15-08-2020
 */
public class Turbo extends Motor {

    /**
     * Le damos valores arbitrarios al motor y llamamos al constructor del padre
     */
    public Turbo() {
        super("Turbo", 300,10,0,10);
    }
    
}