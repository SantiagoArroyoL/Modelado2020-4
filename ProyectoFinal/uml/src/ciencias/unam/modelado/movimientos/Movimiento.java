package ciencias.unam.modelado.movimientos;

/**
 * Interfaz encargada de definir la estrategia del movimiento
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 21-08-2020
 */
public interface Movimiento {

    /**
     * Método que indica cuántos pasos y cómo se mueve un sujeto
     * @return Valor entero de cuánto se mueve el sujeto
     */
    public int moverse();
}
