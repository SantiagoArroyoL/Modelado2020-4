package ciencias.unam.modelado;

public interface Sujeto {

    public void registraObservador(Observador o);
    public void eliminaObservador(Observador o);
    public void mensajeaObservador(Observador o);
}
