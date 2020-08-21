package ciencias.unam.modelado.soldados;

public class Comandante extends Soldado implements IObservable{

    public Comandante(int distancia) {
        super(distancia);
    }

    @Override
    public void notificarAtaque() {

    }

    @Override
    public void notificarMovimiento() {

    }

    @Override
    public void notificarReporte() {

    }
}
