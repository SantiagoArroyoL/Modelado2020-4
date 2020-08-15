package ciencias.unam.modelado;

public class FabricaCoche1 extends FabricaCoche {
    public Coche crearCoche() {
        return super.crearCoche("Deportivas","Deportivo","Deportiva","Simple","Metralleta");
    }
}
