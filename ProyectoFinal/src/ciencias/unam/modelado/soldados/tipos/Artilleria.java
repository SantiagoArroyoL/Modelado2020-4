package ciencias.unam.modelado.soldados.tipos;

import ciencias.unam.modelado.ataques.AtaqueCanon;
import ciencias.unam.modelado.movimientos.MovimientoCanon;
import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase que define el comportamiento de un soldado con especialidad en artillería
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Soldado
 * @since 21-08-2020
 */
public class Artilleria extends Soldado {

    /**
     * Constructor de un soldado de artillería
     * Llamamos al constructor del padre y asignamos los valores pertinentes a su especialidad
     *
     * @param distancia La distancia inicial que tendrá el soldado
     * @param id El id del soldado
     */
    public Artilleria(int distancia, int id) {
        super(distancia, id);
        this.reporte = "artilleria";
        this.vida = 50;
        this.movimiento = new MovimientoCanon();
        this.ataque = new AtaqueCanon();
    }
}
