package ciencias.unam.modelado.movimientos;

import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase encargad e definir los atributos del movimiento normal
 * 
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Movimiento
 * @since 21-08-2020
 */
public class MovimientoPie implements Movimiento{
    /**
     * Método que indica cuántos pasos y cómo se mueve un sujeto
     * @param soldado Es la que tropa que se mueve
     * @return Valor entero de cuánto se mueve el sujeto
     */
    @Override
    public void moverse(Soldado soldado) {
        System.out.print("Mi nombre es "+soldado.getNombre()+" me muevo normal");
        soldado.disminuirDistancia(2);
    }
}
