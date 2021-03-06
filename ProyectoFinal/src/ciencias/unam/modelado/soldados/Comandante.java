package ciencias.unam.modelado.soldados;

import java.util.ArrayList;

import ciencias.unam.modelado.Enemigo;

/**
 * Clase que define el comportamiento del Comandante
 * El comandante puede ejercer cualquier especialidad y además cuenta con los atributos de un Soldado
 * Entonces Comandante extiende la clase Soldado y se le agregaron nuevos métodos
 * Para instanciarse necesita primero de otra instancia de Soldado, simulando que fue un soldado que ascendieron a comandante
 * Los comandantes son los encargados de recibir las ordenes del jugador y notificar a todos los soldados del pelotón
 * Por lo mencionado anteriormente comandante es un observable y un observador
 * Tendrá una lista de observadores en la que a su vez él estará incluido, puesto que si el Usuario decide
 *    que el pelotón ataque, el comandante no sólo debe notificar el ataque, también debe atacar
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see IObservable
 * @since 21-08-2020
 */
public class Comandante extends Soldado implements IObservable{
    /* Arreglo de soldados en el peloton */
    private ArrayList<Soldado> peloton;
    /* El enemigo del peloton */
    private Enemigo enemigo;

    /**
     * Método que revisa que su ejército esté con vida
     * @return true si al menos un soldado tiene vida - false en caso contrario
     */
    public boolean revisaEjercito() {
        int x = 0;
        for (Soldado soldado_temporal : peloton) {
            if (soldado_temporal.getVida() <= 0) {
                x++;
            }
        }
        return x != peloton.size();
    }
    
    /**
     * Para construir un comandante este primero debe ser un soldado y tener un enemigo bien definido
     * @param soldado El soldado que define qué especialidad, vida, ataque e id tendrá nuestro comandante
     * @param enemigo El enemigo contra el que peleará el comandante
     */
    public Comandante(Soldado soldado, Enemigo enemigo) {
        super(soldado);
        this.enemigo = enemigo;
        peloton = new ArrayList<>();
        peloton.add(this);
    }

    /**
     * Ordena a los soldados atacar
     */
    @Override
    public void notificarAtaque() {
        System.out.println("Soy el comandante de nombre " + nombre + " ataquen soldados");
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraAtaque(enemigo);
        }
    }

    /**
     * Ordena a los soldados moverse
     */
    @Override
    public void notificarMovimiento() {
        System.out.println("Soy el comandante de nombre " + nombre + " muevanse soldados");
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraMovimiento();
        }
    }

    /**
     * Ordena a los soldados reportarse
     */
    @Override
    public void notificarReporte() {
        System.out.println("Soy el comandante de nombre " + nombre + ", reportense soldados");
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.muestraReporte();
        }
    }

    /**
     * Regresamos el enemigo del pelotón
     * @return el enemigo del pelotón
     */
    public Enemigo getEnemigo() {
        return enemigo;
    }

    /**
     * Registramos un nuevo soldado en el pelotón
     * @param soldado El soldado a registrar
     */
    @Override
    public void registraSoldado(Soldado soldado) {
        this.peloton.add(soldado);
    }

    /**
     * Registramos un ataque recibido
     * @param vida La vida a disminuir de cada soldado
     */
    public void recibeAtaque(int vida) {
        for (Soldado soldado_temporal : peloton) {
            soldado_temporal.disminuirVida(vida);
        }
    }
}
