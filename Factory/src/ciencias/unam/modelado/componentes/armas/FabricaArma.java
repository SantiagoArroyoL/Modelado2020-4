package ciencias.unam.modelado.componentes.armas;

public class FabricaArma {
    public static final String[] catalogo = {
        "Arpones", "Canones", "Lanzallamas",
        "Metralleta", "Sierra"
    };
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