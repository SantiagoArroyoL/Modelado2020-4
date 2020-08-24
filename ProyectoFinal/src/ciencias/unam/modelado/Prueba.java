package ciencias.unam.modelado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

    private static final String MENU = "1.-Atacar\n2.-Moverse\n3.-Reportarse";

    private static final String OPCIONES = "1•Explorador: Se conforma con 3 pelotones:\n"
                                    + "\tPelotón 1 tienen 6 soldados de infantería.\n"
                                    + "\tPelotón 2 se compone con 1 artillero y 2 miembros de la caballería.\n"
                                    + "\tPelotón 3 se compone con 6 soldados, todos miembros de la caballería.\n"
                                    + "2•Default: Se conforma con 3 pelotones.\n"
                                    + "\tPelotón 1 tienen 6 soldados, todos miembros de la infantería.\n"
                                    + "\tPelotón 2 tiene 3 artilleros.\n"
                                    + "\tPelotón 3 tiene 6 miembros de la caballería.\n"
                                    + "3•Kamikaze: Se conforma de 3 pelotones.\n"
                                    + "\tPelotón 1 y 2 tienen 5 soldados cada uno, todos miembros de la infantería.\n"
                                    + "\tPelotón 3 tiene 5 soldados, todos miembros de la caballería.";

    public static void main(String[] args) {
        Usuario usuario;
        /* Antes de mostrar las opciones creamos al enemigo
         * distancia inicial con valores aleatorios entre 1 y 25
         * vida inicial con valores aleatorios entre 1 y 500  */
        int vida = (int) (Math.random() * 500) + 1;
        int distanciaInicial = (int) (Math.random() * 25) + 1;
        Enemigo enemigo = new Enemigo(vida, distanciaInicial);
        /* Iniciamos el juego! */

        System.out.println("BIENVENIDO!\nUn extraño enemigo está atacando la tierra," +
                " debes reunir a tu ejército y aniquilarlo!");
        System.out.println("Tenemos los siguientes pelotones para ti: \n" + OPCIONES);

        /* Definimos el tipo de usuario */
        switch (lee(1, 3)) {
            case 1:
                usuario = new UsuarioConEjercitoExplorador(enemigo);
                break;
            case 2:
                usuario = new UsuarioConEjercitoDefault(enemigo);
                break;
            case 3:
                usuario = new UsuarioConEjercitoKamikaze(enemigo);
                break;
            default:
                throw new IllegalStateException("Valor inesperado");
        }
        /* Jugamos */
        System.out.println("Tu enemigo se encuentra a " + distanciaInicial + " de distancia");
        System.out.println("Hace " + enemigo.getAtaque() + " de daño sin importar la distancia");
        System.out.println("Cada turno hay 50% de probabilidad de que el enemigo ataque");
        System.out.println("Tiene " + vida + " de vida, tú puedes con él!");
        do {
            System.out.println("Que quieres que haga tu ejército? \n" + MENU);
            switch (lee(1,3)) {
                case 1: usuario.ordenaAtaque(); break;
                case 2: usuario.ordenaMovimiento(); break;
                case 3: usuario.ordenaReportarse(); break;
            }
            /* 50% de que ataque el enemigo */
            if ((Math.random()*10+1) > 5) {
                System.out.println("OH NO! EL ENEMIGO ATACO!");
                enemigo.ataca(usuario);
            }
            System.out.println("VIDA DEL ENEMIGO: " + enemigo.getVida());
        } while(enemigo.getVida() > 0 && usuario.revisaEjercito());
        if (enemigo.getVida() <= 0) {
            System.out.println("EL ENEMIGO HA SIDO DERROTADO!\nFELICIDADES GANASTE EL JUEGO!");
        } else {
            System.out.println("TODOS TUS SOLDADOS HAN MUERTO!\nTU EJERCITO PERDIÓ LA BATALLA!");
        }
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