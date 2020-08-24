package ciencias.unam.modelado.soldados.tipos;

import ciencias.unam.modelado.ataques.AtaquePistola;
import ciencias.unam.modelado.movimientos.MovimientoPie;
import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase que define el comportamiento de un soldado con especialidad en infanteria
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Soldado
 * @since 21-08-2020
 */
public class Infanteria extends Soldado {

    /**
     * Constructor de un soldado de infantería
     * Llamamos al constructor del padre y asignamos los valores pertinentes a su especialidad
     *
     * @param distancia La distancia inicial que tendrá el soldado
     * @param id El id del soldado
     */
    public Infanteria(int distancia, int id) {
        super(distancia, id);
        this.reporte = "infanteria";
        this.vida = 50;
        this.movimiento = new MovimientoPie();
        this.ataque = new AtaquePistola();
    }
}
