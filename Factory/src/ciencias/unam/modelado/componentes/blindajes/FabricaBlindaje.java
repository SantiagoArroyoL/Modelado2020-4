package ciencias.unam.modelado.componentes.blindajes;

public class FabricaBlindaje {
    public static final Blindaje[] catalogo = {
         new Reforzado(), new Simple(), new Tanque()
    };
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