package ciencias.unam.modelado.componentes.llantas;

public class FabricaLlanta {
    public static final Llanta[] catalogo = {
        new Deportivas(), new OffRoad(), new Oruga(), new Simple()
    };
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