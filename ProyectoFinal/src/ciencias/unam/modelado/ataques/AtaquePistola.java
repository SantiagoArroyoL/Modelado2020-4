package ciencias.unam.modelado.ataques;

import ciencias.unam.modelado.Enemigo;
import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase concreta que define el ataque de una pistola
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Ataque
 * @since 21-08-2020
 */
public class AtaquePistola implements Ataque{
    /**
     * Método para atacar
     * El sujeto que llame a este método planea atacar a un enemigo definido
     *
     * @param enemigo El enemigo que recibirá el ataque
     * @param nombre Es el nombre de la tropa que ataca
     */
    @Override
    public void atacar(Enemigo enemigo, Soldado soldado) {
        System.out.println("Mi nombre es "+soldado.getNombre()+" ataco con una pistola, hago daño normal");
        enemigo.recibeDano(3);
    }
}
