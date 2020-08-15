package ciencias.unam.modelado;

import java.util.InputMismatchException;
import java.util.Scanner;

import ciencias.unam.modelado.componentes.armas.FabricaArma;
import ciencias.unam.modelado.componentes.blindajes.FabricaBlindaje;
import ciencias.unam.modelado.componentes.carroceria.FabricaCarroceria;
import ciencias.unam.modelado.componentes.llantas.FabricaLlanta;
import ciencias.unam.modelado.componentes.motores.FabricaMotor;

public class Prueba {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a la tienda de automóviles personalizados MaxMad");
        System.out.println("Para poder comprar debes invertir una cantidad inicial,\n si te sobra dinero te lo notificaremos al final.");
        System.out.println("¿Cuanto deseas invertir en tu nuevo coche?");
        System.out.println("1- $1000 ");
        System.out.println("2- $2000 ");
        System.out.println("3- $20000 ");
        double dinero_inicial = new double[]{1000, 2000, 20000}[lee(1,3)-1]; 

        System.out.println("Deseas armar tu carro o ver alguna de las opciones predeterminadas");
        System.out.println("1- Opciones predeterminadas ");
        System.out.println("2- Armar mi carro ");
        Coche coche = null;
        switch (lee(1,2)) {
            case 1:
                coche = menuPredifinido(dinero_inicial);
                break;
            case 2:
                coche = menuPersonalizado(dinero_inicial);
                break;
            default:
                throw new IllegalStateException("Valor inesperado");
        }
        System.out.println("Tu nuevo coche está listo! Se llama: " + coche.getNombre());
        System.out.println("Aquí tienes una breve descripción: \n" + coche.getDescripcion());
        System.out.println("SUERTE EN EL APOCALIPSIS!");
    }

    private static Coche menuPersonalizado(double dineroInicial){
        int seleccion;
        System.out.println("Escoge unas llantas");
        for (int i = 0; i < FabricaLlanta.catalogo.length; i++) {
            System.out.println((i+1)+".-" + FabricaLlanta.catalogo[i].getNombre() +
                    " Costo: " + FabricaLlanta.catalogo[i].getCosto());
        }
        seleccion = lee(1, FabricaLlanta.catalogo.length);
        dineroInicial -= FabricaLlanta.catalogo[seleccion-1].getCosto();
        String llanta = FabricaLlanta.catalogo[seleccion-1].getNombre();

        System.out.println("Escoge una arma");
        for (int i = 0; i < FabricaArma.catalogo.length; i++) {
            System.out.println((i+1)+".-"+FabricaArma.catalogo[i].getNombre() +
                    " Costo: " + FabricaArma.catalogo[i].getCosto());
        }
        seleccion = lee(1, FabricaArma.catalogo.length);
        dineroInicial -= FabricaArma.catalogo[seleccion-1].getCosto();
        String arma = FabricaArma.catalogo[seleccion-1].getNombre();
        
        System.out.println("Escoge un blindaje");
        for (int i = 0; i < FabricaBlindaje.catalogo.length; i++) {
            System.out.println((i+1)+".-"+FabricaBlindaje.catalogo[i].getNombre() +
                    " Costo: " + FabricaBlindaje.catalogo[i].getCosto());
        }
        seleccion = lee(1, FabricaBlindaje.catalogo.length);
        dineroInicial -= FabricaBlindaje.catalogo[seleccion-1].getCosto();
        String blindaje = FabricaBlindaje.catalogo[seleccion-1].getNombre();

        System.out.println("Escoge un carrocería");
        for (int i = 0; i < FabricaCarroceria.catalogo.length; i++) {
            System.out.println((i+1)+".-"+FabricaCarroceria.catalogo[i].getNombre() +
                    " Costo: " +  FabricaCarroceria.catalogo[i].getCosto());
        }
        seleccion = lee(1, FabricaCarroceria.catalogo.length);
        dineroInicial -= FabricaCarroceria.catalogo[seleccion-1].getCosto();
        String carroceria = FabricaCarroceria.catalogo[seleccion-1].getNombre();

        System.out.println("Escoge un motor");
        for (int i = 0; i < FabricaMotor.catalogo.length; i++) {
            System.out.println((i+1)+".-"+FabricaMotor.catalogo[i].getNombre() +
                    " Costo: " +  FabricaMotor.catalogo[i].getCosto());
        }
        seleccion = lee(1, FabricaMotor.catalogo.length);
        dineroInicial -= FabricaMotor.catalogo[seleccion-1].getCosto();
        String motor = FabricaMotor.catalogo[seleccion-1].getNombre();

        return FabricaCoche.crearCoche(llanta, motor, carroceria, blindaje, arma);
    } //Cierre método menuPersonalizado

    private static Coche menuPredifinido(double dineroInicial){
        Coche[] tipos = FabricaCoche.getPredefinidos();
        System.out.println("Tenemos "+tipos.length+" opciones para ti: ");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println("\n"+(i+1)+": \""+tipos[i].getNombre()+"\"\n"+tipos[i].getDescripcion());
        }
        int seleccion = lee(1,tipos.length);
        return tipos[seleccion-1];
    }


    /**
     * Método que lee hasta que el usuario proporcione una opción válida
     * 
     * @param cota_inferior El mínimo número válido
     * @param cota_superior El máximo número válido
     * @return El número entero leído por el scanner
     */
    private static int lee(int cota_inferior, int cota_superior) {
        int opcion = 0;
        boolean validacion = true;
        do {
            validacion = true;
            try {
                System.out.println("-----------------------------------------------------");
                System.out.print("Selecciona una opcion  --> ");
                opcion = new Scanner(System.in).nextInt();
                validacion = true;
            } catch (InputMismatchException ime) {
                System.out.println("Opción invalida! Introduzca sólo números!");
                validacion = false;
                continue;
            }
            if (opcion < cota_inferior || opcion > cota_superior) {
                System.out.println("Opción invalida! Introduzca un numero valido");
                validacion = false;
            }
        } while (!validacion);
        return opcion;
    }
}