package ciencias.unam.modelado.componentes.blindajes;

import ciencias.unam.modelado.componentes.Componente;

public abstract class Blindaje extends Componente {

    public Blindaje(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}