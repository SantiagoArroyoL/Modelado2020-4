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
    /* El daño que hace el enemigo, valor aleatorio entre 1 y 25 */
    private final int dano = (int) (Math.random() * 25) + 1;

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
        this.vida = Math.max(this.vida - dano, 0);
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

    /**
     * Regresa el daño que hace el enemigo
     * @return número entero de daño
     */
    public int getAtaque() {
        return dano;
    }

    /**
     * El enemigo ataca al ejército del usuario
     * @param usuario El usuario a atacar
     */
    public void ataca(Usuario usuario) {
        usuario.recibeAtaque(dano);
    }
}
