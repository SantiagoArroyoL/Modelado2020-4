package ciencias.unam.modelado.movimientos;

import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase encargad e definir los atributos del movimiento rápido
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
     * @return Valor entero de cuánto se mueve el sujeto
     */
    @Override
    public void moverse(Soldado soldado) {
        System.out.print("Mi nombre es "+soldado.getNombre()+" me muevo rapido");
        soldado.disminuirDistancia(3);
    }
}
