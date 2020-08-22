package ciencias.unam.modelado.movimientos;

import ciencias.unam.modelado.soldados.Soldado;

/**
 * Interfaz encargada de definir la estrategia del movimiento
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 21-08-2020
 */
public interface Movimiento {

    /**
     * Método que indica cuántos pasos y cómo se mueve un sujeto
     * @param soldado Es la que tropa que se mueve
     * @return Valor entero de cuánto se mueve el sujeto
     */
    public void moverse(Soldado soldado);
}
