package ciencias.unam.modelado.soldados;

public interface IObservable {
    public void notificarAtaque();

    public void notificarMovimiento();

    public void notificarReporte();

    public void registraSoldado(Soldado soldado);
}
