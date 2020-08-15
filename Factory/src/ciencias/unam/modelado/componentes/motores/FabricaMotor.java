package ciencias.unam.modelado.componentes.motores;

public class FabricaMotor {
    public static final Motor[] catalogo = {
        new Deportivo(), new Diesel(), new Turbo()
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