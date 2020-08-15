package ciencias.unam.modelado;

public class FabricaCoche3 extends FabricaCoche {
    public Coche crearCoche() {
        return super.crearCoche("Oruga","Diesel","Camion","Tanque","Canones");
    }
}
