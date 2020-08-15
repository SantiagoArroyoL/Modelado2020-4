package ciencias.unam.modelado;

import ciencias.unam.modelado.componentes.blindajes.FabricaBlindaje;
import ciencias.unam.modelado.componentes.carroceria.FabricaCarroceria;
import ciencias.unam.modelado.componentes.llantas.FabricaLlanta;
import ciencias.unam.modelado.componentes.motores.FabricaMotor;
import ciencias.unam.modelado.componentes.armas.FabricaArma;

public class FabricaCoche {
    public static Coche crearCoche(String llanta, String motor, String carroceria,
                             String blindaje, String arma){
        return new Coche(FabricaLlanta.getllanta(llanta), 
        FabricaMotor.getMotor(motor), 
        FabricaCarroceria.getCarroceria(carroceria),
        FabricaBlindaje.getBlindaje(blindaje),
        FabricaArma.getArma(arma));
    }

    public static Coche[] getPredefinidos(){
        return new Coche[]{
            FabricaCoche.crearCoche("Deportivas", "Deportivo", "Deportiva", 
            "Simple", "Lanzallamas"),
            FabricaCoche.crearCoche("OffRoad", "Turbo", "Deportiva", 
            "Tanque", "Lanzallamas"), 
            FabricaCoche.crearCoche("Oruga", "Turbo", "Deportiva", 
            "Tanque", "Sierra")
        };
    }
}