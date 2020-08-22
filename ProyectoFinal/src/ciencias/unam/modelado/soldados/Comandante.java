package ciencias.unam.modelado.soldados;

import java.util.ArrayList;

import ciencias.unam.modelado.Enemigo;

public class Comandante extends Soldado implements IObservable {
    private ArrayList<Soldado> peloton;
    private Enemigo enemigo;

    public Comandante(Soldado soldado, Enemigo enemigo) {
        super(soldado);
        this.enemigo = enemigo;
        peloton = new ArrayList<>();
        peloton.add(this);
    }

    @Override
    public void notificarAtaque() {
        System.out.println("Soy el comandante de nombre " + nombre + " ataquen soldados");
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraAtaque(enemigo);
        }
    }

    @Override
    public void notificarMovimiento() {
        System.out.println("Soy el comandante de nombre " + nombre + " muevanse soldados");
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraMovimiento();
        }
    }

    @Override
    public void notificarReporte() {
        System.out.println("Soy el comandante de nombre " + nombre + " reportense soldados");
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraReporte();
        }
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    @Override
    public void registraSoldado(Soldado soldado) {
        this.peloton.add(soldado);
    }
}
