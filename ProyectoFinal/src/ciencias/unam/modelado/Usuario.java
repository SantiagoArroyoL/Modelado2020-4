package ciencias.unam.modelado;

import java.util.ArrayList;
import java.util.List;
import ciencias.unam.modelado.soldados.Comandante;

public class Usuario {
    private List<Comandante> comandantes;

    public Usuario(Enemigo enemigo){
        comandantes = creaEjercito(enemigo);
    }

    public void ordenaAtaque(){
        for (Comandante comandante : comandantes) {
            comandante.notificarAtaque();
        }
    }

    public void ordenaMovimiento() {
        for (Comandante comandante : comandantes) {
            comandante.notificarMovimiento();
        }
    }

    public void ordenaReportarse() {
        for (Comandante comandante : comandantes) {
            comandante.notificarReporte();
        }
    }

    public void agregaPeloton(Comandante comandante) {
        this.comandantes.add(comandante);
    }

    protected ArrayList<Comandante> creaEjercito(Enemigo enemigo) {
        return new ArrayList<Comandante>();
    }
}
