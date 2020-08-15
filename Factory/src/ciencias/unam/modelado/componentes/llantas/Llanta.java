package ciencias.unam.modelado.componentes.llantas;

import ciencias.unam.modelado.componentes.Componente;

public abstract class Llanta extends Componente {

    public Llanta(String nombre, double costo, int ataque, int defensa, int velocidad) {
        super(nombre, costo, ataque, defensa, velocidad);
    }
    
}