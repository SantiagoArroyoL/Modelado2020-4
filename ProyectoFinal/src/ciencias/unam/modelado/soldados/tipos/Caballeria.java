package ciencias.unam.modelado.soldados.tipos;

import ciencias.unam.modelado.ataques.AtaqueMosquete;
import ciencias.unam.modelado.movimientos.MovimientoCaballo;
import ciencias.unam.modelado.soldados.Soldado;

public class Caballeria extends Soldado {
    public Caballeria(int distancia, int id) {
        super(distancia, id);
        this.reporte = "caballeria";
        this.vida = 100;
        this.movimiento = new MovimientoCaballo();
        this.ataque = new AtaqueMosquete();
    }
} 
