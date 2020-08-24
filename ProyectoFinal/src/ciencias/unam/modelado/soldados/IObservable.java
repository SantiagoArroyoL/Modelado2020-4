package ciencias.unam.modelado.soldados;

/**
 * Interfaz que define el comportamiento del observable
 * El observable notificará a todos los observadores de los cambios que ocurran en el juego
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 21-08-2020
 */
public interface IObservable {

    /**
     * Notifica que uno o varios observadores atacarán
     */
    public void notificarAtaque();

    /**
     * Notifica el movimiento de uno o varios observadores
     */
    public void notificarMovimiento();

    /**
     * Notifica que se pidió un reporte de uno o varios observadores
     */
    public void notificarReporte();

    /**
     * Registramos un nuevo soldado(nuevo observador)
     * @param soldado El soldado a registrar
     */
    public void registraSoldado(Soldado soldado);
}
