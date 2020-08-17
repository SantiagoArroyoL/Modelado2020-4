package ciencias.unam.modelado;

import java.util.HashMap;

import ciencias.unam.modelado.componentes.Componente;
import ciencias.unam.modelado.componentes.armas.Arma;
import ciencias.unam.modelado.componentes.blindajes.Blindaje;
import ciencias.unam.modelado.componentes.carroceria.Carroceria;
import ciencias.unam.modelado.componentes.llantas.Llanta;
import ciencias.unam.modelado.componentes.motores.Motor;

/**
 *
 * Es la clase logica de coche, 
 * simula la existencia de atributos 
 * como el ataque, la defensa, la velocidad
 * y el costo, valores que son la suma de las 
 * caracteristicas de sus componentes
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 16-08-2020
 */
public class Coche {
    /**
     * Se emplea un hashmap como variable para encapsular a los componentes
     * y poder de usar el patron de iterador
     */
    private HashMap<String, Componente> componentes;

    /**
     * Inicializa las variables en el hashmap y asigna las llaves para su acceso
     * dependiendo del tipo de componentes
     * @param llanta Representa logicamente la llanta del coche
     * @param motor Representa logicamente el motor del coche
     * @param carroceria Representa logicamente la carrceria del coche
     * @param blindaje Representa logicamente el blindaje del coche
     * @param arma Representa logicamente el arma del coche
     */
    public Coche(Llanta llanta, Motor motor, Carroceria carroceria, Blindaje blindaje, Arma arma){
        componentes = new HashMap<>();
        componentes.put("llantas", llanta);
        componentes.put("motor", motor);
        componentes.put("carroceria", carroceria);
        componentes.put("blindaje", blindaje);
        componentes.put("arma", arma);
    }

    /**
     * Es el metodo GET para el blindaje del coche
     * @return El blindaje del coche
     */
    public Blindaje getBlindaje(){
        return (Blindaje) componentes.get("blindaje");
    }

    /**
     * Es el metodo GET para el motor del coche
     * @return El motor del coche
     */
    public Motor getMotor(){
        return (Motor) componentes.get("motor");
    }
    /**
     * Es el metodo GET para las llantas del coche
     * @return Las llantas del coche
     */
    public Llanta getLlantas(){
        return (Llanta) componentes.get("llanta");
    }
    /**
     * Es el metodo GET para la carroceria del coche
     * @return La carroceria del coche
     */
    public Carroceria getCarroceria(){
        return (Carroceria) componentes.get("carroceria");
    }
    /**
     * Es el metodo GET para la arma del coche
     * @return La arma del coche
     */
    public Arma getArma(){
        return (Arma) componentes.get("arma");
    }
    /**
     * Es el metodo GET para el costo coche
     * Suma los costos de todos los componentes del coche
     * @return La suma total de los costos de los componentes
     */
    public double getCosto(){
        double total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getCosto();
        }
        return total;
    }
    /**
     * Es el metodo GET para el atributo ataque del  coche
     * Suma los atributos ataque de todos los componentes del coche
     * @return La suma total de los atributos ataque de los componentes
     */
    public int getAtaque(){
        int total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getAtaque();
        }
        return total;
    }
    /**
     * Es el metodo GET para el atributo defensa del  coche
     * Suma los atributos defensa de todos los componentes del coche
     * @return La suma total de los atributos defensa de los componentes
     */
    public int getDefensa(){
        int total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getDefensa();
        }
        return total;
    }
    /**
     * Es el metodo GET para el atributo velocidad del  coche
     * Suma los atributos velocidad de todos los componentes del coche
     * @return La suma total de los atributos velocidad de los componentes
     */
    public int getVelocidad(){
        int total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getVelocidad();
        }
        return total;
    }
    /**
     * Muestra una descripcion de cada uno de los componentes del coche
     * @return Un String que describe el tipo de cada uno de los componentes 
     * del coche
     */
    public String getDescripcion(){
        String descripcion = "Llantas: " + getLlantas().getNombre();
        descripcion += ", Carrocería: " + getCarroceria().getNombre();
        descripcion += ", Blindaje: " + getBlindaje().getNombre();
        descripcion += ", Motor: " + getMotor().getNombre();
        descripcion += ", Arma: " + getArma().getNombre();
        descripcion += "\nCosto Total: " + getCosto();
        descripcion += "\nVelocidad: " + getVelocidad();
        descripcion += "\nDefensa: " + getDefensa();
        descripcion += "\nAtaque " + getAtaque();
        return descripcion;
    }
}
