package ciencias.unam.modelado;

import java.util.InputMismatchException;
import java.util.Scanner;

import ciencias.unam.modelado.componentes.llantas.OffRoad;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a la tienda de automoviles personalizados MaxMad");
        System.out.println("Para poder comprar debes invertir una cantidad inicial,\n si te sobra dinero te lo notificaremos al final.");
        System.out.println("¿Cuanto deseas invertir en tu nuevo coche?");
        System.out.println("1- $1000 ");
        System.out.println("2- $2000 ");
        System.out.println("3- $20000 ");
        double dinero_inicial = new double[]{1000, 2000, 20000}[lee(1,3)-1]; 

        System.out.println("Deseas armar tu carro o ver alguna de las opciones predeterminadas");
        System.out.println("1- Opciones predeterminadas ");
        System.out.println("2- Armar mi carro ");
        switch (lee(1,2)) {
            case 1:
                
                break;
            case 2:
                
                break;
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }

    private static Coche menuPersonalizado(){
        System.out.println("Escoge unas llantas");
        
    }

    private static Coche menuPredifinido(){
        Coche[] tipos = new Coche[]{
            FabricaCoche.crearCoche("Deportivas", "Deportivo", "Deportiva", 
            "Simple", "Lanzallamas"),
            FabricaCoche.crearCoche("OffRoad", "Turbo", "Deportiva", 
            "Tanque", "Lanzallamas"), 
            FabricaCoche.crearCoche("Oruga", "Turbo", "Deportiva", 
            "Tanque", "Sierra")
        };
        System.out.println("Tenemos "+tipos.length+" opciones para ti: ");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i+1)+".-"+tipos[i].getDescripcion());
        }
        return tipos[lee(1, tipos.length)];                                             
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