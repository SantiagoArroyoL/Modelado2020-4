package ciencias.unam.modelado.ataques;

import ciencias.unam.modelado.Enemigo;

/**
 * Interfaz encargada de definir la estrategia del ataque
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 21-08-2020
 */
public interface Ataque {

    /**
     * Método para atacar
     * El sujeto que llame a este método planea atacar a un enemigo definido
     * @param enemigo El enemigo que recibirá el ataque
     */
    public void atacar(Enemigo enemigo);
}
