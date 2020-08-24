package ciencias.unam.modelado.movimientos;

import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase encargad e definir los atributos del movimiento lento
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Movimiento
 * @since 21-08-2020
 */
public class MovimientoCanon implements Movimiento{

    /**
     * Método que indica cuántos pasos y cómo se mueve un sujeto
     * @param soldado Es la que tropa que se mueve
     */
    @Override
    public void moverse(Soldado soldado) {
        System.out.print("Soy "+soldado.getNombre()+" me estoy moviendo lento" + "| VIDA: " + soldado.getVida());
        soldado.disminuirDistancia(1);
    }
}
