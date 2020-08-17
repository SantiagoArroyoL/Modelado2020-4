package ciencias.unam.modelado.componentes.armas;

/**
 *
 * Clase concreta del arma Cañon
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Arma
 * @since 15-08-2020
 */
public class Canones extends Arma {

    /**
     * Le damos valores arbitrarios al arma y llamamos al constructor del padre
     */
    public Canones() {
        super("Canones", 300,10,5,1);
    }
}