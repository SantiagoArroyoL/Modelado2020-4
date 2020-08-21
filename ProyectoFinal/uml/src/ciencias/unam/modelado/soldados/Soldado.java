package ciencias.unam.modelado.soldados;

import ciencias.unam.modelado.ataques.Ataque;
import ciencias.unam.modelado.movimientos.Movimiento;

public class Soldado implements IObservador {

    public int id;
    public String nombre;
    public int vida;
    public int distancia;
    public Movimiento movimiento;
    public Ataque ataque;
    public String reporte;

    public Soldado(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public void muestraAvance() {

    }

    @Override
    public void muestraReporte() {

    }

    @Override
    public void muestraMovimiento() {

    }
}
