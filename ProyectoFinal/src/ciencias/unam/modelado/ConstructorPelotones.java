package ciencias.unam.modelado;

import ciencias.unam.modelado.soldados.*;
import ciencias.unam.modelado.soldados.tipos.*;

/**
 * Clase constructora de pelotones
 * Esta clase construirá los pelotones, creando primero al comandante y luego a cada soldado según se necesite
 * Los soldados se añadirán al pelotón del comandante y estarán listos para la luca
 * EL proceso de construcción se realizó siguiendo el patrón de creación Builder
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Comandante
 * @see Soldado
 * @since 21-08-2020
 */
public class ConstructorPelotones {
    /* enemigo del peloton */
    private Enemigo enemigo;
    /* id único inicial */
    public static int id = 0;
    /* comandante del peloton */
    private Comandante comandante;
    /* Tipos de soldado: */
    public static final String ARTILLERIA = "ARTILLERIA";
    public static final String CABALLERIA = "CABALLERIA";
    public static final String INFANTERIA = "INFANTERIA";

    /**
     * Constructor del pelotón - especificamos qué especialidad queremos
     *   para el comandante y le asignamos un enemigo
     * @param tipoComandante La especialidad del comandante
     * @param enemigo El enemigo a combatir
     */
    public ConstructorPelotones(String tipoComandante, Enemigo enemigo) {
        this.enemigo = enemigo;
        this.comandante = new Comandante(creaSoldado(tipoComandante), enemigo);
    }

    /**
     * Agregamos un soldado al pelotón
     * @param tipo La especialidad que tendrá el soldado
     * @param numero número entero que indica cuántos soldados queremos
     */
    public void agregaSoldados(String tipo, int numero) {
        for (int i = 0; i < numero; i++) {
            comandante.registraSoldado(creaSoldado(tipo)); 
        }
    }

    /**
     * Método para crear una nueva instancia de Soldado
     * @param tipo La especialidad que le daremos al soldado
     * @return Un nuevo soldado
     */
    public Soldado creaSoldado(String tipo) {
        switch (tipo) {
            case ARTILLERIA:
                return new Artilleria(enemigo.getDistanciaInicial(), id++);
            case CABALLERIA:
                return new Caballeria(enemigo.getDistanciaInicial(), id++);
            case INFANTERIA:
                return new Infanteria(enemigo.getDistanciaInicial(), id++);
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * Regresamos al comandante del pelotón
     * @return El comandante
     */
    public Comandante getInstancia() {
        return comandante;
    }
}
