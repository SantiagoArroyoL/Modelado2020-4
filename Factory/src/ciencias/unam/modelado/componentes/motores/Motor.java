package ciencias.unam.modelado.componentes.motores;

import ciencias.unam.modelado.componentes.Componente;

public abstract class Motor extends Componente {

    public Motor(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}