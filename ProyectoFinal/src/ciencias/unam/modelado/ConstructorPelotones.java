package ciencias.unam.modelado;

import ciencias.unam.modelado.soldados.*;
import ciencias.unam.modelado.soldados.tipos.*;

public class ConstructorPelotones {
    public static int id = 0;
    public static final String ARTILLERIA = "ARTILLERIA";
    public static final String CABALLERIA = "CABALLERIA";
    public static final String INFANTERIA = "INFANTERIA";
    public static final String[] TIPOS  = {ARTILLERIA, CABALLERIA, INFANTERIA};
    private Comandante comandante;
    private Enemigo enemigo;

    public ConstructorPelotones(String tipoComandante, Enemigo enemigo) {
        this.enemigo = enemigo;
        this.comandante = new Comandante(creaSoldado(tipoComandante), enemigo);
    }

    public void agregaSoldados(String tipo, int numero) {
        for (int i = 0; i < numero; i++) {
            comandante.registraSoldado(creaSoldado(tipo)); 
        }
    }

    public Soldado creaSoldado(String tipo) {
        switch (tipo) {
            case ARTILLERIA:
                return new Artilleria(enemigo.getDistanciaInicial(), id++);
            case CABALLERIA:
                return new Caballeria(enemigo.getDistanciaInicial(), id++);
            case INFANTERIA:
                return new Infanteria(enemigo.getDistanciaInicial(), id++);
            default:
                throw new IllegalArgumentException();
        }
    }

    public Comandante getInstancia() {
        return comandante;
    }
}
