package ciencias.unam.modelado.componentes.blindajes;

/**
 *
 * Fábrica de Blindaje es la clase que encapsula las creaciones de los distintos tipos de armas
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Blindaje
 * @since 15-08-2020
 */
public class FabricaBlindaje {

    /* El blindaje que sabemos que existen */
    public static final String[] catalogo = {
         "Reforzado", "Simple" , "Tanque"
    };

    /**
     * Método que crea el arma pedida
     *
     * @param tipo EL nombre del blindaje que queremos crear
     * @return El blindaje creado y listo para ser añadida a un coche
     */
    public static Blindaje getBlindaje(String tipo){
        switch (tipo) {
            case "Reforzado":
                return new Reforzado();
            case "Simple":
                return new Simple();
            case "Tanque":
                return new Tanque();
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }
}