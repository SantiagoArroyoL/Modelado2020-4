package ciencias.unam.modelado.componentes.llantas;

/**
 *
 * Fábrica de Llanta es la clase que encapsula las creaciones de los distintos tipos de llantas
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Llanta
 * @since 15-08-2020
 */
public class FabricaLlanta {

    /* Las llantas que sabemos que existen */
    public static final String[] catalogo = {
        "Deportivas", "OffRoad", "Oruga", "Simple"
    };

    /**
     * Método que crea las llantas pedida
     *
     * @param tipo El nombre de las llantas que queremos crear
     * @return La llanta creada y lista para ser añadida a un coche
     */
    public static Llanta getLlanta(String tipo){
        switch (tipo) {
            case "Deportivas":
                return new Deportivas();
            case "OffRoad":
                return new OffRoad();
            case "Oruga":
                return new Oruga();
            case "Simple":
                return new Simple();
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }
}