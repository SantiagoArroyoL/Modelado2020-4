package ciencias.unam.modelado.soldados.tipos;

import ciencias.unam.modelado.ataques.AtaqueMosquete;
import ciencias.unam.modelado.movimientos.MovimientoCaballo;
import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase que define el comportamiento de un soldado con especialidad en caballeria
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Soldado
 * @since 21-08-2020
 */
public class Caballeria extends Soldado {

    /**
     * Constructor de un soldado de caballería
     * Llamamos al constructor del padre y asignamos los valores pertinentes a su especialidad
     *
     * @param distancia La distancia inicial que tendrá el soldado
     * @param id El id del soldado
     */
    public Caballeria(int distancia, int id) {
        super(distancia, id);
        this.reporte = "caballeria";
        this.vida = 100;
        this.movimiento = new MovimientoCaballo();
        this.ataque = new AtaqueMosquete();
    }
} 
