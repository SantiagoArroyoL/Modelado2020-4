package ciencias.unam.modelado;

public class Prueba {
   
    public static void main(String[] args) {
        int vida = 10;//(int) (Math.random() * 25) + 1;
        int distanciaInicial = 3;//(int) (Math.random() * 25) + 1;

        Enemigo enemigo = new Enemigo(vida, distanciaInicial);
        
        Usuario usuario = new UsuarioConEjercitoDefault(enemigo);
        usuario.ordenaReportarse();
        usuario.ordenaMovimiento();
        usuario.ordenaMovimiento();
        usuario.ordenaAtaque();
    }
}