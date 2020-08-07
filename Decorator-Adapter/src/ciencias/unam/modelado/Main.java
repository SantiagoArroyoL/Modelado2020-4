package ciencias.unam.modelado;

import java.util.Scanner;
import java.util.InputMismatchException;

import ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas.*;
import ciencias.unam.modelado.waysub.baguette.*;
import ciencias.unam.modelado.waysub.ingredientes.*;


public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        Comida platillo;

        System.out.println("-----------------------------------------------------");
        System.out.println("\nBienvenido al restaurante en linea!");
        System.out.println("Si deseas un WaySub teclea 1");
        System.out.println("Si deseas una PizzasCangrejo teclea 2");
        System.out.println("-----------------------------------------------------");
        System.out.print("Seleccionar una opción  --> ");

        opcion = lee(1, 2);

        switch (opcion) {
            case 1:
                platillo = menuWaySub();
                break;
            case 2:
                platillo = menuPizzasCangrejo();
                break;
            default:
                throw new IllegalStateException("Valor inesperado: " + opcion);
        }

        System.out.println("Muchas gracias por comprar con nosotros, aquí está tu ticket:\n" + platillo.getDescripcion());
        System.out.println("Costo total: $" + platillo.getCosto());

    }// Cierre del método main

    private static Comida menuWaySub() {
        System.out.println("-----------------------------------------------------");
        System.out.println("\nBienvenido a WaySub!, ¿Que clase de Baguette vas a querer hoy?");
        Comida comida = null;
        System.out.println("1. Con Ajo");
        System.out.println("2. Blanco");
        System.out.println("3. Integral");
        System.out.println("-----------------------------------------------------");
        System.out.print("Selecciona una opcion  --> ");
        int tipo_pan = lee(1, 3);
        switch (tipo_pan) {
            case 1:
                comida = new Ajo();
                break;
            case 2:
                comida = new Blanco();
                break;
            case 3:
                comida = new Integral();
                break;

            default:
                throw new IllegalStateException("Valor inesperado: " + tipo_pan);
        }
        boolean mas_ingredientes;
        do {
            mas_ingredientes = false;
            System.out.println("¿Que ingrediente le vas a poner a tu waysub?");
            System.out.println("1. Catsup");
            System.out.println("2. Cebolla");
            System.out.println("3. Jamon");
            System.out.println("4. Jitomate");
            System.out.println("5. Lechuga");
            System.out.println("6. Mayonesa");
            System.out.println("7. Mostaza");
            System.out.println("8. Pepperoni");
            System.out.println("-----------------------------------------------------");
            System.out.print("Selecciona una opcion  --> ");
            int opcion = lee(1, 8);
            switch (opcion) {
                case 1:
                    comida = new Catsup(comida);
                    break;
                case 2:
                    comida = new Cebolla(comida);
                    break;
                case 3:
                    comida = new Jamon(comida);
                    break;
                case 4:
                    comida = new Jitomate(comida);
                    break;
                case 5:
                    comida = new Lechuga(comida);
                    break;
                case 6:
                    comida = new Mayonesa(comida);
                    break;
                case 7:
                    comida = new Mostaza(comida);
                    break;
                case 8:
                    comida = new Pepperoni(comida);
                    break;
                default:
                    throw new IllegalStateException("Valor inesperado: " + opcion);
            }
            System.out.println("¿Deseas agregar otro ingrediente?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.println("-----------------------------------------------------");
            System.out.print("Selecciona un tipo  --> ");
            int confirmacion = lee(1, 2);
            if (confirmacion == 1) {
                mas_ingredientes = true;
            }
        } while (mas_ingredientes);
        return comida;
    }

    private static Comida menuPizzasCangrejo() {
        AdaptadorPizzaCangrejo[] pizzas = new AdaptadorPizzaCangrejo[] { new AdaptadorPizzaCangrejo(new TipoPizza1()),
                new AdaptadorPizzaCangrejo(new TipoPizza2()), new AdaptadorPizzaCangrejo(new TipoPizza3()),
                new AdaptadorPizzaCangrejo(new TipoPizza4()), new AdaptadorPizzaCangrejo(new TipoPizza5()) };
        System.out.println("-----------------------------------------------------");
        System.out.println("\nBienvenido a las Pizzas de Don Cangrejo!\n\t¿Qué tipo de pizza quieres?");
        System.out.println("Tipo 1: Jamón, queso cheddar y masa delgada \tCosto: " + pizzas[0].getCosto());
        System.out.println("Tipo 2: Salchicha, queso cheddar y masa gruesa \tCosto: " + pizzas[1].getCosto());
        System.out.println("Tipo 3: Jamón, queso cheddar y masa gruesa \tCosto: " + pizzas[2].getCosto());
        System.out.println("Tipo 4: Pollo, queso manchego y masa delgada \tCosto: " + pizzas[3].getCosto());
        System.out.println("Tipo 5: Salchicha, queso manchego y masa gruesa \tCosto: " + pizzas[4].getCosto());
        System.out.println("-----------------------------------------------------");
        System.out.print("Selecciona un tipo  --> ");
        int opcion = lee(1, 5);
        return pizzas[opcion-1];
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
                opcion = new Scanner(System.in).nextInt();
                validacion = true;
            } catch (InputMismatchException ime) {
                System.out.println("Opción invalida!\nIntroduzca sólo números!");
                validacion = false;
                continue;
            }
            if (opcion < cota_inferior || opcion > cota_superior) {
                System.out.println("Opción invalida!\nIntroduzca un numero valido");
                validacion = false;
            }
        } while (!validacion);
        return opcion;
    }

}
