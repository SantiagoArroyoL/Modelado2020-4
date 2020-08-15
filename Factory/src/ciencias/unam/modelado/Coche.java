package ciencias.unam.modelado;

import java.util.HashMap;

import ciencias.unam.modelado.componentes.Componente;
import ciencias.unam.modelado.componentes.armas.Arma;
import ciencias.unam.modelado.componentes.blindajes.Blindaje;
import ciencias.unam.modelado.componentes.carroceria.Carroceria;
import ciencias.unam.modelado.componentes.llantas.Llanta;
import ciencias.unam.modelado.componentes.motores.Motor;

public class Coche {
    private HashMap<String, Componente> componentes;
    public Coche(Llanta llanta, Motor motor, Carroceria carroceria, Blindaje blindaje, Arma arma){
        componentes = new HashMap<>();
        componentes.put("llanta", llanta);
        componentes.put("motor", motor);
        componentes.put("carroceria", carroceria);
        componentes.put("blindaje", blindaje);
        componentes.put("arma", arma);
    }

    public Blindaje getBlindaje(){
        return (Blindaje) componentes.get("blindaje");
    }

    public Motor getMotor(){
        return (Motor) componentes.get("motor");
    }

    public Llanta getLlantas(){
        return (Llanta) componentes.get("llantas");
    }

    public Carroceria getCarroceria(){
        return (Carroceria) componentes.get("carroceria");
    }

    public Arma getArma(){
        return (Arma) componentes.get("arma");
    }

    public double getCosto(){
        double total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getCosto();
        }
        return total;
    }

    public int getAtaque(){
        int total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getAtaque();
        }
        return total;
    }

    public int getDefensa(){
        int total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getDefensa();
        }
        return total;
    }

    public int getVelocidad(){
        int total = 0;
        for (Componente componente : componentes.values()) {
            total += componente.getVelocidad();
        }
        return total;
    }

    public String getDescripcion(){
        String descripcion = "";
        for (Componente componente : componentes.values()) {
            descripcion += componente.getNombre() + " ";
        }
        descripcion.trim();
        return descripcion;
    }
}
