package ciencias.unam.modelado.soldados;

import ciencias.unam.modelado.Enemigo;
/**
 * Interfaz que define el comportamiento del observador
 * Los observadores en este caso realizarán acciones y se las mostrarán al observable
 * El observable entonces notificará al reste observadores
 * Las acciones son los tres métodos implementados en esta clase
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 21-08-2020
 */
public interface IObservador {

    /**
     * Atacamos a un enemigo
     * @param enemigo El enemigo que recibe un ataque
     */
    public void muestraAtaque(Enemigo enemigo);

    /**
     * Mostramos un reporte
     */
    public void muestraReporte();

    /**
     * Nos movemos
     */
    public void muestraMovimiento();
}
