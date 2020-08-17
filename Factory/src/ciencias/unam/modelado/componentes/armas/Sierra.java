package ciencias.unam.modelado.componentes.armas;

/**
 *
 * Clase concreta del arma Sierra
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Arma
 * @since 15-08-2020
 */
public class Sierra extends Arma {

    /**
     * Le damos valores arbitrarios al arma y llamamos al constructor del padre
     */
    public Sierra() {
        super("Sierra", 9.99,1,1,6);
    }
}