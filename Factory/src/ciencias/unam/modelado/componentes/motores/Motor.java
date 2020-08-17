package ciencias.unam.modelado.componentes.motores;

import ciencias.unam.modelado.componentes.Componente;

/**
 *
 * Clase abstracta encargada de encapsular el comportamiento y atributos del motor
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Componente
 * @since 15-08-2020
 */
public abstract class Motor extends Componente {

    /**
     * Constructor del motor
     * @param nombre El nombre que tendrá el motor
     * @param costo El costo (Número double) que tendrá el motor
     * @param ataque Cuánto añade de ataque el motor al coche
     * @param defensa Cuánto añade de defensa el motor al coche
     * @param velocidad Cuánto velocidad de ataque el motor al coche
     */
    public Motor(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}