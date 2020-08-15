package ciencias.unam.modelado;

public class FabricaCoche2 extends FabricaCoche {
    public Coche crearCoche() {
        return super.crearCoche("OffRoad","Diesel","Camion","Reforzado","Arpones");
    }
}
