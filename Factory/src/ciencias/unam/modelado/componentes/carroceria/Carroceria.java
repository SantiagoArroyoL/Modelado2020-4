package ciencias.unam.modelado.componentes.carroceria;

import ciencias.unam.modelado.componentes.Componente;

public abstract class Carroceria extends Componente {

    public Carroceria(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}