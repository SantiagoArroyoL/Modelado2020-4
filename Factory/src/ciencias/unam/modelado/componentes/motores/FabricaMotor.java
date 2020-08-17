package ciencias.unam.modelado.componentes.motores;

/**
 *
 * Fábrica de motor es la clase que encapsula las creaciones de los distintos tipos de motor
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Motor
 * @since 15-08-2020
 */
public class FabricaMotor {

    /* Los motores que sabemos que existen */
    public static final String[] catalogo = {
        "Deportivo", "Diesel", "Turbo"
    };

    /**
     * Método que crea el motor pedido
     *
     * @param tipo El nombre del motor que queremos crear
     * @return El motor creado y listo para ser añadido a un coche
     */
    public static Motor getMotor(String tipo){
        switch (tipo) {
            case "Deportivo":
                return new Deportivo();
            case "Diesel":
                return new Diesel();
            case "Turbo":
                return new Turbo();
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }
}