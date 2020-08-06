package ciencias.unam.modelado;

import java.util.InputMismatchException;
import java.util.Scanner;

import ciencias.unam.modelado.pizzasDonCangrejo.Pizza;
import ciencias.unam.modelado.pizzasDonCangrejo.tiposPizzas.*;

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

        String ticket = platillo.getDescripcion();
        System.out.println("Muchas gracias por comprar con nosotros, aquí está tu ticket:\n" + ticket);
        System.out.println("Costo total: " + platillo.getCosto());

    }// Cierre del método main

    private static Comida menuWaySub() {
        System.out.println("-----------------------------------------------------");
        System.out.println("\nBienvenido a WaySub!");
        System.out.println("1. La primera opción");
        System.out.println("2. La segunda opción");
        System.out.println("3. La tercera opción");
        System.out.println("-----------------------------------------------------");
        System.out.print("Seleccionar una opción  --> ");
        return new AdaptadorPizza(0);
    }

    /**
     * @TODO -- Hay un problema, por ser un método estático todas las pizzas me las
     *       marca de tipo 1
     * @return
     */
    private static Comida menuPizzasCangrejo() {
        AdaptadorPizzaCangrejo[] pizzas = new AdaptadorPizzaCangrejo[]{
            new AdaptadorPizzaCangrejo(new TipoPizza1()),
            new AdaptadorPizzaCangrejo(new TipoPizza2()),
            new AdaptadorPizzaCangrejo(new TipoPizza3()),
            new AdaptadorPizzaCangrejo(new TipoPizza4()),
            new AdaptadorPizzaCangrejo(new TipoPizza5())
        };
        System.out.println("-----------------------------------------------------");
        System.out.println("\nBienvenido a las Pizzas de Don Cangrejo!\n\t¿Qué tipo de pizza quieres?");
        System.out.println("Tipo 1: Jamón, queso cheddar y masa delgada \tCosto: " + pizzas[1].getCosto());
        System.out.println("Tipo 2: Salchicha, queso cheddar y masa gruesa \tCosto: " + pizzas[2].getCosto());
        System.out.println("Tipo 3: Jamón, queso cheddar y masa gruesa \tCosto: " + pizzas[3].getCosto());
        System.out.println("Tipo 4: Pollo, queso manchego y masa delgada \tCosto: " + pizzas[4].getCosto());
        System.out.println("Tipo 5: Salchicha, queso manchego y masa gruesa \tCosto: " + pizzas[5].getCosto());
       
        System.out.println("-----------------------------------------------------");
        System.out.print("Selecciona un tipo  --> ");
        int opcion = lee(1, 5);
        return pizzas[opcion];
    }

    /**
     * Método que lee hasta que el usuario proporcione una opción válida
     * 
     * @param x El valor que indica qué estamos leyendo true si es la primera vez
     *          que leemos - false en caso contrario
     * @return El número entero leído por el scanner
     */
    private static int lee(int cota_inferior, int cota_superior) {
        int opcion = 0;
        boolean validacion = true;
        Scanner leer = new Scanner(System.in);
        do {
            try {
                opcion = leer.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Opción invalida!\nIntroduzca sólo números!");
                continue;
            }
            if (opcion < cota_inferior || opcion > cota_superior) {
                System.out.println("Opción invalida!\nIntroduzca un numero valido");
                validacion = false;
            }
        } while (!validacion);
        leer.close();
        return opcion;
    }

}
