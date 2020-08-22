package ciencias.unam.modelado.soldados.tipos;

import ciencias.unam.modelado.ataques.AtaqueCanon;
import ciencias.unam.modelado.movimientos.MovimientoCanon;
import ciencias.unam.modelado.soldados.Soldado;

public class Artilleria extends Soldado {
    public Artilleria(int distancia, int id) {
        super(distancia, id);
        this.reporte = "artilleria";
        this.vida = 50;
        this.movimiento = new MovimientoCanon();
        this.ataque = new AtaqueCanon();
    }
}
