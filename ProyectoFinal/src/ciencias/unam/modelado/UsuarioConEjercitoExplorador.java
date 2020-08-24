package ciencias.unam.modelado;

import ciencias.unam.modelado.soldados.Comandante;

import java.util.ArrayList;

/**
 * Clase concreta que le da al usuario un ejército predefinido explorador
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Usuario
 * @since 21-08-2020
 */
public class UsuarioConEjercitoExplorador extends Usuario{

    /**
     * Constructor - llamamos al constructor del padre y asignamos el enemigo
     * @param enemigo El enemigo a asignar
     */
    public UsuarioConEjercitoExplorador(Enemigo enemigo) {
        super(enemigo);
    }

    /**
     * Creamos al ejército
     * @param enemigo El enemigo del ejército
     * @return El ejército
     */
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
