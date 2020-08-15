package ciencias.unam.modelado.componentes.motores;

public class FabricaMotor {
    public static final String[] catalogo = {
        "Deportivo", "Diesel", "Turbo"
    };
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