package ciencias.unam.modelado.componentes.armas;

import ciencias.unam.modelado.componentes.Componente;

public abstract class Arma extends Componente {

    public Arma(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}