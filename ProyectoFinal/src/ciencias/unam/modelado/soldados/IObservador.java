package ciencias.unam.modelado.soldados;

import ciencias.unam.modelado.Enemigo;

public interface IObservador {

    public void muestraAtaque(Enemigo enemigo);

    public void muestraReporte();

    public void muestraMovimiento();
}
