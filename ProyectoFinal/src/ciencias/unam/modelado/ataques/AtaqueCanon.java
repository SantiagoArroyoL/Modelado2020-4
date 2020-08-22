package ciencias.unam.modelado.ataques;

import ciencias.unam.modelado.Enemigo;
import ciencias.unam.modelado.soldados.Soldado;

/**
 * Clase concreta que define el ataque de un cañón
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Ataque
 * @since 21-08-2020
 */
public class AtaqueCanon implements Ataque{

    /**
     * Método para atacar
     * El sujeto (tropa) que llame a este método planea atacar a un enemigo definido
     * La tropa que decida atacar recibirá algo de daño al llamar este método
     *
     * @param enemigo El enemigo que recibirá el ataque
     * @param soldado Es la tropa que ataca
     */
    @Override
    public void atacar(Enemigo enemigo, Soldado soldado) {
        System.out.println("Mi nombre es "+soldado.getNombre()+" ataco con un canon, hago mucho mucho daño, pero tambien pierdo vida");
        enemigo.recibeDano(3);
        soldado.disminuirVida(2);
    }
}
