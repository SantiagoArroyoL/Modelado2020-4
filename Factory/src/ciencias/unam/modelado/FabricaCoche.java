package ciencias.unam.modelado;

import ciencias.unam.modelado.componentes.blindajes.FabricaBlindaje;
import ciencias.unam.modelado.componentes.carroceria.FabricaCarroceria;
import ciencias.unam.modelado.componentes.llantas.FabricaLlanta;
import ciencias.unam.modelado.componentes.motores.FabricaMotor;
import ciencias.unam.modelado.componentes.armas.FabricaArma;

public class FabricaCoche {
    public Coche crearCoche(String llanta, String motor, String carroceria,
                             String blindaje, String arma){
        return new Coche(new FabricaLlanta().getllanta(llanta), 
        new FabricaMotor().getMotor(motor), 
        new FabricaCarroceria().getCarroceria(carroceria),
        new FabricaBlindaje().getBlindaje(blindaje),
        new FabricaArma().getArma(arma));
    }
}