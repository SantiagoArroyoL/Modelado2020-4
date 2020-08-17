package ciencias.unam.modelado.componentes.armas;

/**
 *
 * Clase concreta del arma arpon
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Arma
 * @since 15-08-2020
 */
public class Arpones extends Arma {

    /**
     * Le damos valores arbitrarios al arma y llamamos al constructor del padre
     */
    public Arpones() {
        super("Arpones", 75.25,5,2,10);
    }
    
}