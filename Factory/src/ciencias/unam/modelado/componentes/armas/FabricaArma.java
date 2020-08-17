package ciencias.unam.modelado.componentes.armas;

/**
 *
 * Fábrica de Armas es la clase que encapsula las creaciones de los distintos tipos de armas
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Arma
 * @since 15-08-2020
 */
public class FabricaArma {

    /* Las armas que sabemos que existen */
    public static final String[] catalogo = {
        "Arpones", "Canones", "Lanzallamas",
        "Metralleta",  "Sierra"
    };

    /**
     * Método que crea el arma pedida
     *
     * @param tipo EL nombre del arma que queremos crear
     * @return El arma creada y lista para ser añadida a un coche
     */
    public static Arma getArma(String tipo){
        switch (tipo) {
            case "Arpones":
                return new Arpones();
            case "Canones":
                return new Canones();
            case "Lanzallamas":
                return new Lanzallamas();
            case "Metralleta":
                return new Metralleta();
            case "Sierra":
                return new Sierra();
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }
}