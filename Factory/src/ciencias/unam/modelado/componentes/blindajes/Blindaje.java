package ciencias.unam.modelado.componentes.blindajes;

import ciencias.unam.modelado.componentes.Componente;

/**
 *
 * Clase abstracta encargada de encapsular el comportamiento y atributos del blindaje
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Componente
 * @since 15-08-2020
 */
public abstract class Blindaje extends Componente {

    /**
     * Constructor del blindaje
     * @param nombre El nombre que tendrá el blindaje
     * @param costo El costo (Número double) que tendrá el blindaje
     * @param ataque Cuánto añade de ataque el blindaje al coche
     * @param defensa Cuánto añade de defensa el blindaje al coche
     * @param velocidad Cuánto velocidad de ataque el blindaje al coche
     */
    public Blindaje(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}