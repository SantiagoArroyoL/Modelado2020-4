package ciencias.unam.modelado.componentes.llantas;

/**
 *
 * Clase concreta de las llantas deportivas
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Llanta
 * @since 15-08-2020
 */
public class Deportivas extends Llanta {

    /**
     * Le damos valores arbitrarios a las llantas y llamamos al constructor del padre
     */
    public Deportivas() {
        super("Deportivas", 300,6,5,10);
    }
    
}