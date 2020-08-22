package ciencias.unam.modelado.soldados;

import java.util.ArrayList;

import ciencias.unam.modelado.Enemigo;

public class Comandante extends Soldado implements IObservable{
    private ArrayList<Soldado> peloton;
    private Enemigo enemigo;
    private Soldado soldado;

    public Comandante(Soldado soldado, Enemigo enemigo) {
        super(soldado.distancia, soldado.getId());
        this.reporte = soldado.reporte;
        this.movimiento = soldado.movimiento;
        this.ataque = soldado.ataque;
        this.vida = soldado.vida;
        this.nombre = soldado.nombre;

        this.soldado = soldado;
        this.enemigo = enemigo;
        peloton =  new ArrayList<>();
    }

    @Override
    public void notificarAtaque() {
        System.out.println("Soy el comandante de nombre "+nombre+ " ataquen soldados");
        muestraAtaque(enemigo);
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraAtaque(enemigo);
        }
    }

    @Override
    public void notificarMovimiento() {
        System.out.println("Soy el comandante de nombre "+nombre+ " muevanse soldados");
        muestraMovimiento();
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraMovimiento();
        }
    }

    @Override
    public void notificarReporte() {
        System.out.println("Soy el comandante de nombre "+nombre+ " reportense soldados");
        muestraReporte();
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraReporte();
        }
    }

    @Override
    public void muestraAtaque(Enemigo enemigo) {
        soldado.muestraAtaque(enemigo);
    }

    @Override
    public void muestraReporte() {
        soldado.muestraReporte();
    }

    @Override
    public void muestraMovimiento() {
        soldado.muestraMovimiento();
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    @Override
    public void registraSoldado(Soldado soldado){
        this.peloton.add(soldado);
    }
}
