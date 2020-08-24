package ciencias.unam.modelado.movimientos;

import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase encargada de definir los atributos del movimiento rápido
 * 
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Movimiento
 * @since 21-08-2020
 */
public class MovimientoCaballo implements Movimiento{

    /**
     * Método que indica cuántos pasos y cómo se mueve un sujeto
     * @param soldado Es la que tropa que se mueve
     */
    @Override
    public void moverse(Soldado soldado) {
        System.out.print("Soy "+soldado.getNombre()+" me estoy moviendo rápido" + "| VIDA: " + soldado.getVida());
        soldado.disminuirDistancia(3);
    }
}
