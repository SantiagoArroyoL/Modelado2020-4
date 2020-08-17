package ciencias.unam.modelado.componentes.carroceria;

import ciencias.unam.modelado.componentes.Componente;

/**
 *
 * Clase abstracta encargada de encapsular el comportamiento y atributos de la carrocería
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Componente
 * @since 15-08-2020
 */
public abstract class Carroceria extends Componente {

    /**
     * Constructor de la carroceria
     * @param nombre El nombre que tendrá la carroceria
     * @param costo El costo (Número double) que tendrá la carroceria
     * @param ataque Cuánto añade de ataque la carroceria al coche
     * @param defensa Cuánto añade de defensa la carroceria al coche
     * @param velocidad Cuánto velocidad de ataque la carroceria al coche
     */
    public Carroceria(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}