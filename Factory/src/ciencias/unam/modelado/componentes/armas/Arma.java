package ciencias.unam.modelado.componentes.armas;

import ciencias.unam.modelado.componentes.Componente;

public class Arma extends Componente{

    public Arma(String nombre, double costo) {
        super("Arma "+nombre, costo);
    }
    
}