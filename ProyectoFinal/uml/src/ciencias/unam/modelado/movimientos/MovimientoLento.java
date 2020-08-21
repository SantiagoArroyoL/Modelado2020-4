package ciencias.unam.modelado.movimientos;

/**
 * Clase encargad e definir los atributos del movimiento lento
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Movimiento
 * @since 21-08-2020
 */
public class MovimientoLento implements Movimiento{
    /**
     * Método que indica cuántos pasos y cómo se mueve un sujeto
     *
     * @return Valor entero de cuánto se mueve el sujeto
     */
    @Override
    public int moverse() {
        return 0;
    }
}
