package ciencias.unam.modelado;

import java.util.ArrayList;
import java.util.List;
import ciencias.unam.modelado.soldados.Comandante;

/**
 * Clase Usuario - encargada del comportamiento de un usuario
 * Esta clase es la que interactuará con el usuario y será la encargada
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comandante
 * @since 21-08-2020
 */
public abstract class Usuario {

    /* Lista que contiene lista de los comandantes de cada pelotón */
    private List<Comandante> comandantes;

    /**
     * Constructor Usuario
     * Definimos al enemigo al que se enfrentará el usuario
     * Creamos al constructor de ejércitos para asignar dicho ejercito al usuario
     * @param enemigo El enemigo del usuario
     */
    public Usuario(Enemigo enemigo){
        comandantes = creaEjercito(enemigo);
    }

    /**
     * Método que indica que el usuario quiere atacar
     * Ordenamos al comandante del ejército que ataque
     */
    public void ordenaAtaque(){
        for (Comandante comandante : comandantes) {
            comandante.notificarAtaque();
        }
    }

    /**
     * Método que indica que el usuario quiere mover al ejército
     * Ordenamos al comandante del ejército que se mueva
     */
    public void ordenaMovimiento() {
        for (Comandante comandante : comandantes) {
            comandante.notificarMovimiento();
        }
    }

    /**
     * Método que indica que el usuario quiere que se ejército se reporte
     * Ordenamos al comandante del ejército que se reporte
     */
    public void ordenaReportarse() {
        for (Comandante comandante : comandantes) {
            comandante.notificarReporte();
        }
    }

    /**
     * Método que indica que el usuario recibió un ataque
     * @param vida La cantidad de vida a disminuir
     */
    public void recibeAtaque(int vida) {
        for (Comandante comandante : comandantes) {
            comandante.recibeAtaque(vida);
        }
    }

    /**
     * Método que agrega un pelotón a la lista de pelotones posible
     */
    public void agregaPeloton(Comandante comandante) {
        this.comandantes.add(comandante);
    }

    /**
     * Creamos un ejército
     * @param enemigo El enemigo del ejército
     * @return Lista que contiene a los comandantes de cada pelotón
     */
    protected ArrayList<Comandante> creaEjercito(Enemigo enemigo) {
        return new ArrayList<Comandante>();
    }

    /**
     * Método que revisa que su ejército esté con vida
     * @return true si al menos un soldado tiene vida - false en caso contrario
     */
    public boolean revisaEjercito() {
        int x = 0;
        for (Comandante comandante : comandantes) {
            if (!comandante.revisaEjercito()) {
                x++;
            }
        }
        return x != comandantes.size();
    }
}
