package ciencias.unam.modelado;

public class Enemigo {
    private int vida;
    private int distanciaInicial;

    public Enemigo(int vida, int distanciaInicial) {
        this.vida = vida;
        this.distanciaInicial = distanciaInicial;
    }

    public void recibeDano(int dano) {
        vida -= dano;
    }

    public int getVida() {
        return vida;
    }

    public int getDistanciaInicial() {
        return distanciaInicial;
    }
}
