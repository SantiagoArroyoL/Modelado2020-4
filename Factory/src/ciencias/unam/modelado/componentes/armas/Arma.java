package ciencias.unam.modelado.componentes.armas;

import ciencias.unam.modelado.componentes.Componente;

/**
 *
 * Clase abstracta encargada de encapsular el comportamiento y atributos de las armas
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Componente
 * @since 15-08-2020
 */
public abstract class Arma extends Componente {

    /**
     * Constructor del arma
     * @param nombre El nombre que tendrá el arma
     * @param costo El costo (Número double) que tendrá el arma
     * @param ataque Cuánto añade de ataque el arma al coche
     * @param defensa Cuánto defensa de ataque el arma al coche
     * @param velocidad Cuánto velocidad de ataque el arma al coche
     */
    public Arma(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}