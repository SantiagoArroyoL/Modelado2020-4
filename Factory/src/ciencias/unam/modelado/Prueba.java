package ciencias.unam.modelado;

import java.util.InputMismatchException;
import java.util.Scanner;

import ciencias.unam.modelado.componentes.Componente;
import ciencias.unam.modelado.componentes.armas.FabricaArma;
import ciencias.unam.modelado.componentes.blindajes.FabricaBlindaje;
import ciencias.unam.modelado.componentes.carroceria.FabricaCarroceria;
import ciencias.unam.modelado.componentes.llantas.FabricaLlanta;
import ciencias.unam.modelado.componentes.motores.FabricaMotor;

public class Prueba {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la tienda de automóviles personalizados MaxMad");
        System.out.println(
                "Para poder comprar debes invertir una cantidad inicial,\n si te sobra dinero te lo notificaremos al final.");
        System.out.println("¿Cuanto deseas invertir en tu nuevo coche?");
        System.out.println("1- $3000 ");
        System.out.println("2- $4000 ");
        System.out.println("3- $20000 ");
        ReferenciaNumeroDoble dinero_inicial = new ReferenciaNumeroDoble(
                new double[] { 3000, 4000, 20000 }[lee(1, 3) - 1]);

        System.out.println("Deseas armar tu carro o ver alguna de las opciones predeterminadas");
        System.out.println("1- Opciones predeterminadas ");
        System.out.println("2- Armar mi carro ");
        Coche coche = null;
        switch (lee(1, 2)) {
            case 1:
                coche = menuPredifinido(dinero_inicial);
                break;
            case 2:
                coche = menuPersonalizado(dinero_inicial);
                break;
            default:
                throw new IllegalStateException("Valor inesperado");
        }
        System.out.println("Aquí tienes una breve descripción de tu coche: \n" + coche.getDescripcion());
        System.out.println("Ataque: " + coche.getAtaque());
        System.out.println("Defensa: " + coche.getDefensa());
        System.out.println("Velocidad: " + coche.getVelocidad());
        System.out.println(
                "Tu cambio, no te lo daremos, es MaxMad, pero te habian sobrado: " + dinero_inicial.getValor());
        System.out.println("SUERTE EN EL APOCALIPSIS!");
    }

    private static Coche menuPersonalizado(ReferenciaNumeroDoble dineroInicial) {
        String llanta, motor, carroceria, blindaje, arma;
        int seleccion;
        double respaldo = dineroInicial.getValor();

        Componente componenteSeleccionado;
        do {
            System.out.println("Escoge unas llantas");
            for (int i = 0; i < FabricaLlanta.catalogo.length; i++) {
                System.out.println((i + 1) + ".-" + FabricaLlanta.catalogo[i] + " Costo: "
                        + FabricaLlanta.getllanta(FabricaLlanta.catalogo[i]).getCosto());
            }
            seleccion = lee(1, FabricaLlanta.catalogo.length) - 1;
            componenteSeleccionado = FabricaLlanta.getllanta(FabricaLlanta.catalogo[seleccion]);
            if (componenteSeleccionado.getCosto() > dineroInicial.getValor()) {
                System.out.println("No tienes suficiente dinero");
                System.out.println("1.- Ya probe todas las opciones de llanta");
                System.out.println("2.- Quiero probar otra opcion de llanta");
                if (lee(1, 2) == 1) {
                    return menuPersonalizado(new ReferenciaNumeroDoble(respaldo));
                }
            }
        } while (componenteSeleccionado.getCosto() > dineroInicial.getValor());
        dineroInicial.restar(componenteSeleccionado.getCosto());
        llanta = FabricaBlindaje.catalogo[seleccion];
        System.out.println("Te quedan: "+dineroInicial);

        do {
            System.out.println("Escoge un arma");
            for (int i = 0; i < FabricaArma.catalogo.length; i++) {
                System.out.println((i + 1) + ".-" + FabricaArma.catalogo[i] + " Costo: "
                        + FabricaArma.getArma(FabricaArma.catalogo[i]).getCosto());
            }
            seleccion = lee(1, FabricaArma.catalogo.length) - 1;
            componenteSeleccionado = FabricaArma.getArma(FabricaArma.catalogo[seleccion]);
            if (componenteSeleccionado.getCosto() > dineroInicial.getValor()) {
                System.out.println("No tienes suficiente dinero");
                System.out.println("1.- Ya probe todas las opciones de arma");
                System.out.println("2.- Quiero probar otra opcion de arma");
                if (lee(1, 2) == 1) {
                    System.out.println("--------------------------------------");
                    System.out.println("Volvemos a empezar desde el inicio");
                    return menuPersonalizado(new ReferenciaNumeroDoble(respaldo));
                }
            }
        } while (componenteSeleccionado.getCosto() > dineroInicial.getValor());
        dineroInicial.restar(componenteSeleccionado.getCosto());
        arma = FabricaArma.catalogo[seleccion];
        System.out.println("Te quedan: "+dineroInicial);

        do {
            System.out.println("Escoge un blindaje");
            for (int i = 0; i < FabricaBlindaje.catalogo.length; i++) {
                System.out.println((i + 1) + ".-" + FabricaBlindaje.catalogo[i] + " Costo: "
                        + FabricaBlindaje.getBlindaje(FabricaBlindaje.catalogo[i]).getCosto());
            }
            seleccion = lee(1, FabricaBlindaje.catalogo.length) - 1;
            componenteSeleccionado = FabricaBlindaje.getBlindaje(FabricaBlindaje.catalogo[seleccion]);
            if (componenteSeleccionado.getCosto() > dineroInicial.getValor()) {
                System.out.println("No tienes suficiente dinero");
                System.out.println("1.- Ya probe todas las opciones de blindaje");
                System.out.println("2.- Quiero probar otra opcion de blindaje");
                if (lee(1, 2) == 1) {
                    return menuPersonalizado(new ReferenciaNumeroDoble(respaldo));
                }
            }
        } while (componenteSeleccionado.getCosto() > dineroInicial.getValor());
        dineroInicial.restar(componenteSeleccionado.getCosto());
        blindaje = FabricaBlindaje.catalogo[seleccion];
        System.out.println("Te quedan: "+dineroInicial);

        do {
            System.out.println("Escoge una carroceria");
            for (int i = 0; i < FabricaCarroceria.catalogo.length; i++) {
                System.out.println((i + 1) + ".-" + FabricaCarroceria.catalogo[i] + " Costo: "
                        + FabricaCarroceria.getCarroceria(FabricaCarroceria.catalogo[i]).getCosto());
            }
            seleccion = lee(1, FabricaCarroceria.catalogo.length) - 1;
            componenteSeleccionado = FabricaCarroceria.getCarroceria(FabricaCarroceria.catalogo[seleccion]);
            if (componenteSeleccionado.getCosto() > dineroInicial.getValor()) {
                System.out.println("No tienes suficiente dinero");
                System.out.println("1.- Ya probe todas las opciones de carroceria");
                System.out.println("2.- Quiero probar otra opcion de carroceria");
                if (lee(1, 2) == 1) {
                    return menuPersonalizado(new ReferenciaNumeroDoble(respaldo));
                }
            }
        } while (componenteSeleccionado.getCosto() > dineroInicial.getValor());
        dineroInicial.restar(componenteSeleccionado.getCosto());
        carroceria = FabricaCarroceria.catalogo[seleccion];
        System.out.println("Te quedan: "+dineroInicial);

        do {
            System.out.println("Escoge un motor");
            for (int i = 0; i < FabricaMotor.catalogo.length; i++) {
                System.out.println((i + 1) + ".-" + FabricaMotor.catalogo[i] + " Costo: "
                        + FabricaMotor.getMotor(FabricaMotor.catalogo[i]).getCosto());
            }
            seleccion = lee(1, FabricaMotor.catalogo.length) - 1;
            componenteSeleccionado = FabricaMotor.getMotor(FabricaMotor.catalogo[seleccion]);
            if (componenteSeleccionado.getCosto() > dineroInicial.getValor()) {
                System.out.println("No tienes suficiente dinero");
                System.out.println("1.- Ya probe todas las opciones de motor");
                System.out.println("2.- Quiero probar otra opcion de motor");
                if (lee(1, 2) == 1) {
                    return menuPersonalizado(new ReferenciaNumeroDoble(respaldo));
                }
            }
        } while (componenteSeleccionado.getCosto() > dineroInicial.getValor());
        dineroInicial.restar(componenteSeleccionado.getCosto());
        motor = FabricaCarroceria.catalogo[seleccion];
        System.out.println("Te quedan: "+dineroInicial);

        return FabricaCoche.crearCoche(llanta, motor, carroceria, blindaje, arma);
    }

    private static Coche menuPredifinido(ReferenciaNumeroDoble dineroInicial) {
        int seleccion;
        Coche[] tipos = FabricaCoche.getPredefinidos();
        do {
            System.out.println("Tenemos " + tipos.length + " opciones para ti: ");
            for (int i = 0; i < tipos.length; i++) {
                System.out
                        .println("\n" + (i + 1) + ":" + tipos[i].getDescripcion() + "\t Costo:" + tipos[i].getCosto());
            }
            seleccion = lee(1, tipos.length);
            if (tipos[seleccion - 1].getCosto() > dineroInicial.getValor()) {
                System.out.println("No tienes suficiente dinero, escoge otra opcion");
                System.out.println("------------------------------------------------");
            }
        } while (tipos[seleccion - 1].getCosto() > dineroInicial.getValor());
        dineroInicial.setValor(dineroInicial.getValor() - tipos[seleccion - 1].getCosto());
        System.out.println(dineroInicial);
        return tipos[seleccion - 1];
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