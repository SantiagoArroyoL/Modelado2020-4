package ciencias.unam.modelado.componentes.carroceria;

public class FabricaCarroceria {
    public static final Carroceria[] catalogo = {
        new Camion(), new Casual(), new Deportiva()
    };
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