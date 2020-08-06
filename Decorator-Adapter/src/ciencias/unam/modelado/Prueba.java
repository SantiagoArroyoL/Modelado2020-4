// package ciencias.unam.modelado;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// /**
//  *
//  */
// public class Prueba {

//     public static void main(String[] args) {
//         int opcion = 0;
//         Comida platillo;

//         System.out.println("-----------------------------------------------------");
//         System.out.println("\nBienvenido al restaurante en linea!");
//         System.out.println("Si deseas ir al menú de WaySub teclea 1");
//         System.out.println("Si deseas ir al menú de las PizzasCangrejo teclea 2");
//         System.out.println("-----------------------------------------------------");
//         System.out.print("Seleccionar una opción  --> ");

//         opcion = lee(true);

//         switch (opcion) {
//             case 1: platillo = menuWaySub(); break;
//             case 2: platillo = menuPizzasCangrejo(); break;
//             default: throw new IllegalStateException("Valor inesperado: " + opcion);
//         }

//         String ticket = platillo.getTicket();
//         System.out.println("Muchas gracias por comprar con nosotros, aquí está tu ticket:\n" + ticket);

//     }//Cierre del método main

//     private static Comida menuWaySub() {
//         System.out.println("-----------------------------------------------------");
//         System.out.println("\nBienvenido a WaySub!");
//         System.out.println("1. La primera opción");
//         System.out.println("2. La segunda opción");
//         System.out.println("3. La tercera opción");
//         System.out.println("-----------------------------------------------------");
//         System.out.print("Seleccionar una opción  --> ");
//         return new AdaptadorPizza(0);
//     }

//     /**
//      * @TODO -- Hay un problema, por ser un método estático todas las pizzas me las marca de tipo 1
//      * @return
//      */
//     private static Comida menuPizzasCangrejo() {
//         AdaptadorPizza temp;
//         System.out.println("-----------------------------------------------------");
//         System.out.println("\nBienvenido a las Pizzas de Don Cangrejo!\n\t¿Qué tipo de pizza quieres?");
//         temp = new AdaptadorPizza(1);
//         System.out.println("Tipo 1: Una deliciosa pizza de jamón y queso cheddar\n\tCosto: " + temp.getCosto());
//         temp = new AdaptadorPizza(2);
//         System.out.println("Tipo 2: Una pizza de salchicha y masa gruesa\n\tCosto: " + temp.getCosto());
//         temp = new AdaptadorPizza(3);
//         System.out.println("Tipo 3: Una deliciosa pizza exactamente igual a la primera opción\n\tCosto: " + temp.getCosto());
//         temp = new AdaptadorPizza(4);
//         System.out.println("Tipo 4: Una saludable pizza de pollo, queso manchego y masa delgada\n\tCosto: " + temp.getCosto());
//         temp = new AdaptadorPizza(5);
//         System.out.println("Tipo 5: Una pizza monstruosa de Salchicha, masa gruesa y manchego\n\tCosto: " + temp.getCosto());
//         System.out.println("-----------------------------------------------------");
//         System.out.print("Selecciona un tipo  --> ");
//         int opcion = lee(false);
//         return new AdaptadorPizza(opcion);
//     }

//     /**
//      * Método que lee hasta que el usuario proporcione una opción válida
//      * @param x El valor que indica qué estamos leyendo
//      *          true si es la primera vez que leemos - false en caso contrario
//      * @return El número entero leído por el scanner
//      */
//     private static int lee(boolean x) {
//         int opcion = 0;
//         boolean validacion = false;
//         Scanner leer = new Scanner(System.in);

//         do {
//             try{
//                 opcion = leer.nextInt();
//             } catch(InputMismatchException ime) {
//                 System.out.println("Opción invalida!\nIntroduzca sólo números!");
//                 continue;
//             }
//             if (x) {
//                 if (opcion < 1 || opcion > 2) {
//                     System.out.println("Opción invalida!\nIntroduzca 1 o 2");
//                     continue;
//                 }
//             }
//             if (opcion < 1 || opcion > 5) {
//                 System.out.println("Opción invalida!\nIntroduzca un tipo válido");
//                 continue;
//             }
//             validacion = true;
//         } while(!validacion);

//         return opcion;
//     }

// }
