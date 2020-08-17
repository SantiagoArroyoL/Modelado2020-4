package ciencias.unam.modelado.componentes.llantas;

import ciencias.unam.modelado.componentes.Componente;

/**
 *
 * Clase abstracta encargada de encapsular el comportamiento y atributos de las llantas
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Componente
 * @since 15-08-2020
 */
public abstract class Llanta extends Componente {

    /**
     * Constructor de las llantas
     * @param nombre El nombre que tendrá las llantas
     * @param costo El costo (Número double) que tendrá las llantas
     * @param ataque Cuánto añade de ataque las llantas al coche
     * @param defensa Cuánto añade de defensa las llantas al coche
     * @param velocidad Cuánto velocidad de ataque las llantas al coche
     */
    public Llanta(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}