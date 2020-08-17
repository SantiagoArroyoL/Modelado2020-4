package ciencias.unam.modelado;

import ciencias.unam.modelado.componentes.blindajes.FabricaBlindaje;
import ciencias.unam.modelado.componentes.carroceria.FabricaCarroceria;
import ciencias.unam.modelado.componentes.llantas.FabricaLlanta;
import ciencias.unam.modelado.componentes.motores.FabricaMotor;
import ciencias.unam.modelado.componentes.armas.FabricaArma;

/**
 *
 * Permite encapsular los metodos mediante
 * los cuales se instancian coches. 
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 16-08-2020
 */
public class FabricaCoche {
    /**
     * Es un metodo que permite llamar a las demas fabricas 
     * de componentes he inicializar un coche. 
     * @param llanta Es la clave en forma de string que le permite 
     * a la clase FabricaLlanta saber que tipo de llanta instanciar
     * @param motor Es la clave en forma de string que le permite 
     * a la clase FabricaMotor saber que tipo de motor instanciar
     * @param carroceria Es la clave en forma de string que le permite 
     * a la clase FabricaCarroceria saber que tipo de carroceria instanciar
     * @param blindaje Es la clave en forma de string que le permite 
     * a la clase FabricaBlindaje saber que tipo de blindaje instanciar
     * @param arma Es la clave en forma de string que le permite 
     * a la clase FabricaArma saber que tipo de arma instanciar
     * @return Una instancia de un coche con los parametros seleccionados mediante los string
     */
    public static Coche crearCoche(String llanta, String motor, String carroceria, String blindaje, String arma) {
        return new Coche(FabricaLlanta.getLlanta(llanta), FabricaMotor.getMotor(motor),
                FabricaCarroceria.getCarroceria(carroceria), FabricaBlindaje.getBlindaje(blindaje),
                FabricaArma.getArma(arma));
    }
    /**
     * Es un metodo que devuelve 3 instancias de coches,
     * son los modelos que existen por defecto para los usuarios perezosos, 
     * se crean como instancias nuevas en cada ejecución del metodo 
     * en lugar de como referencias estaticas con el objetivo de
     * evitar modificaciones que afecten el uso de la clase. 
     * @return Un arreglo de instancias de coches, que simulan el catalogo de 
     * coches predefinidos para usuarios perezosos
     */
    public static Coche[] getPredefinidos() {
        return new Coche[] { FabricaCoche.crearCoche("Deportivas", "Deportivo", "Deportiva", "Simple", "Lanzallamas"),
                FabricaCoche.crearCoche("OffRoad", "Turbo", "Deportiva", "Tanque", "Lanzallamas"),
                FabricaCoche.crearCoche("Oruga", "Turbo", "Deportiva", "Tanque", "Sierra") };
    }
}