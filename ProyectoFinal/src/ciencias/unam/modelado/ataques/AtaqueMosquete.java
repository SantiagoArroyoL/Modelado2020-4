package ciencias.unam.modelado.ataques;

import ciencias.unam.modelado.Enemigo;
import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase concreta que define el ataque de un mosquete
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Ataque
 * @since 21-08-2020
 */
public class AtaqueMosquete implements Ataque{
    /**
     * Método para atacar
     * El sujeto que llame a este método planea atacar a un enemigo definido
     *
     * @param enemigo El enemigo que recibirá el ataque
     * @param nombre Es el nombre de la tropa que ataca
     */
    @Override
    public void atacar(Enemigo enemigo, Soldado soldado) {
        System.out.println("Mi nombre es "+soldado.getNombre()+" ataco con un mosquete, hago mucho daño");
        enemigo.recibeDano(3);;
    }
}
