package ciencias.unam.modelado.componentes.motores;

import ciencias.unam.modelado.componentes.Componente;

public abstract class Motor extends Componente {

    public Motor(String nombre, double costo) {
        super("Motor: "+nombre, costo);
    }
    
}