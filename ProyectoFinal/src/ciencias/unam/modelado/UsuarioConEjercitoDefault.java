package ciencias.unam.modelado;

import java.util.ArrayList;

import ciencias.unam.modelado.soldados.Comandante;

public class UsuarioConEjercitoDefault extends Usuario {
    public UsuarioConEjercitoDefault(Enemigo enemigo) {
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
        constructor.agregaSoldados(ConstructorPelotones.ARTILLERIA, 2);
        comandantes.add(constructor.getInstancia());
        //Tercer peloton
        constructor = new ConstructorPelotones(ConstructorPelotones.CABALLERIA ,enemigo);
        constructor.agregaSoldados(ConstructorPelotones.CABALLERIA, 5);
        comandantes.add(constructor.getInstancia());

        return comandantes;
    }
}