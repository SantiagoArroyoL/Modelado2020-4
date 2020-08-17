package ciencias.unam.modelado.componentes.carroceria;

/**
 *
 * Fábrica de Carrocería es la clase que encapsula las creaciones de los distintos tipos de carrocerías
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see Carroceria
 * @since 15-08-2020
 */
public class FabricaCarroceria {

    /* La carrocería que sabemos que existe */
    public static final String[] catalogo = {
        "Camion", "Casual" , "Deportiva"
    };

    /**
     * Método que crea la carrocería pedida
     *
     * @param tipo El nombre de la carrocería que queremos crear
     * @return La carrocería creada y lista para ser añadida a un coche
     */
    public static Carroceria getCarroceria(String tipo){
        switch (tipo) {
            case "Camion":
                return new Camion();
            case "Casual":
                return new Casual();
            case "Deportiva":
                return new Deportiva();
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }
}