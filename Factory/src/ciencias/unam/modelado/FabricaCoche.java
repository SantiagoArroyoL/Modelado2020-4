package ciencias.unam.modelado;

import ciencias.unam.modelado.componentes.blindajes.FabricaBlindaje;
import ciencias.unam.modelado.componentes.carroceria.FabricaCarroceria;
import ciencias.unam.modelado.componentes.llantas.FabricaLlanta;
import ciencias.unam.modelado.componentes.motores.FabricaMotor;
import ciencias.unam.modelado.componentes.armas.FabricaArma;

public class FabricaCoche {

    public static Coche crearCoche(String llanta, String motor, String carroceria, String blindaje, String arma){
        return new Coche(FabricaLlanta.getLlanta(llanta),
                        FabricaMotor.getMotor(motor),
                        FabricaCarroceria.getCarroceria(carroceria),
                        FabricaBlindaje.getBlindaje(blindaje),
                        FabricaArma.getArma(arma));
    } //Cierre método crear Coche

    public static Coche[] getPredefinidos() {
        Coche uno = FabricaCoche.crearCoche("Deportivas", "Deportivo", "Deportiva", "Simple", "Lanzallamas");
        uno.setNombre("Meteoro");
        Coche dos = FabricaCoche.crearCoche("OffRoad", "Turbo", "Deportiva", "Tanque", "Lanzallamas");
        dos.setNombre("El desfibrilador");
        Coche tres = FabricaCoche.crearCoche("Oruga", "Turbo", "Deportiva", "Tanque", "Sierra");
        tres.setNombre("El destructor");
        return new Coche[]{uno, dos, tres};
    }
}