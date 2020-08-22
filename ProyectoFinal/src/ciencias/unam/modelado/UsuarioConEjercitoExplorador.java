package ciencias.unam.modelado;

import ciencias.unam.modelado.soldados.Comandante;

import java.util.ArrayList;

public class UsuarioConEjercitoExplorador extends Usuario{
    public UsuarioConEjercitoExplorador(Enemigo enemigo) {
        super(enemigo);
    }
    @Override
    protected ArrayList<Comandante> creaEjercito(Enemigo enemigo) {
        ArrayList<Comandante> comandantes = new ArrayList<>();
        ConstructorPelotones constructor;

        //Primer peloton
        constructor = new ConstructorPelotones(ConstructorPelotones.INFANTERIA ,enemigo);
        constructor.agregaSoldados(ConstructorPelotones.INFANTERIA, 5);
        comandantes.add(constructor.getInstancia());
        //Segundo peloton
        constructor = new ConstructorPelotones(ConstructorPelotones.ARTILLERIA ,enemigo);
        constructor.agregaSoldados(ConstructorPelotones.CABALLERIA, 2);
        comandantes.add(constructor.getInstancia());
        //Tercer peloton
        constructor = new ConstructorPelotones(ConstructorPelotones.CABALLERIA ,enemigo);
        constructor.agregaSoldados(ConstructorPelotones.CABALLERIA, 5);
        comandantes.add(constructor.getInstancia());

        return comandantes;
    }
}
