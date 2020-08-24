package ciencias.unam.modelado;

import ciencias.unam.modelado.soldados.Comandante;

/**
 * Clase Enemigo - encargada del comportamiento de un enemigo
 * Sólo definimos su salud inicial y la distancia a la que se encuentra
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comandante
 * @since 21-08-2020
 */
public class Enemigo {

    /* La vida del enemigo */
    private int vida;
    /* la distancia a la que se encuentra */
    private int distanciaInicial;

    /**
     * Constructor del enemigo - definimos su distancia y vida iniciales
     * @param vida La vida inicial que tendrá
     * @param distanciaInicial La distancia inicial a la que se encontrará
     */
    public Enemigo(int vida, int distanciaInicial) {
        this.vida = vida;
        this.distanciaInicial = distanciaInicial;
    }

    /**
     * Método para indicar cuando el enemigo recibe daño
     * @param dano EL número entero con el daño recibido
     */
    public void recibeDano(int dano) {
        if(vida-dano < 0){
            vida = 0;
        }else{
            vida -= dano;
        }
    }

    /**
     * Regresamos la vida del enemigo
     * @return La vida del enemigo
     */
    public int getVida() {
        return vida;
    }

    /**
     * Regresamos la distancia del enemigo
     * @return Número entero con la distancia
     */
    public int getDistanciaInicial() {
        return distanciaInicial;
    }
}
