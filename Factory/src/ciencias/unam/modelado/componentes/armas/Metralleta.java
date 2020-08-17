package ciencias.unam.modelado.componentes.armas;

/**
 *
 * Clase concreta del arma metralleta
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Arma
 * @since 15-08-2020
 */
public class Metralleta extends Arma {

    /**
     * Le damos valores arbitrarios al arma y llamamos al constructor del padre
     */
    public Metralleta() {
        super("Metralleta", 15,1,3,10);
    }
}