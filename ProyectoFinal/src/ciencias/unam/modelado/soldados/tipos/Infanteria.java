package ciencias.unam.modelado.soldados.tipos;

import ciencias.unam.modelado.ataques.AtaquePistola;
import ciencias.unam.modelado.movimientos.MovimientoPie;
import ciencias.unam.modelado.soldados.Soldado;

public class Infanteria extends Soldado {
    public Infanteria(int distancia, int id) {
        super(distancia, id);
        this.reporte = "infanteria";
        this.vida = 50;
        this.movimiento = new MovimientoPie();
        this.ataque = new AtaquePistola();
    }
}
