package ciencias.unam.modelado.soldados;

import ciencias.unam.modelado.Enemigo;
import ciencias.unam.modelado.ataques.Ataque;
import ciencias.unam.modelado.movimientos.Movimiento;

/**
 * Clase que define el comportamiento de cualquier soldado, que serán los
 * observadores El solado tiene vida, un nombre, id y se encuentra a cierta
 * distancia de un enemigo Además la especialidad del soldado se definirá en las
 * clases que hereden de esta No permitimos la instanciación de esta clase
 * porque no tendrá su especialidad definida
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see IObservador
 * @since 21-08-2020
 */
public abstract class Soldado implements IObservador {

    /**
     * Clase privada auxiliar que sólo sirve para poder crear un nombre en tiempo
     * constante
     */
    private static class DiccionarioDeNombres {
        /* Arreglo con todos los nombres posibles: */
        private static final String[] nombres = new String[] { "Aarón", "Ander", "Joaquín", "Abel", "Andrés", "Joel",
                "Abelardo", "Ángel", "Jon", "Abraham", "Aníbal", "Jordi", "Adalberto", "Antonio", "Jorge", "Adam",
                "Arnau", "José", "Adán", "Arturo", "Jose", "Antonio", "Adiran", "Asier", "Jose", "Luis", "Adolfo",
                "Augusto", "Jose", "Manuel", "Adrià", "Aurelio", "Jose", "Maria", "Adrián", "Baltasar", "Juan",
                "Agustín", "Bartolomé", "Blas", "Aimar", "Basilio", "Juan", "Antonio", "Aitor", "Benito", "Boris",
                "Alano", "Benjamín", "Juan", "Carlos", "Alberto", "Bernardo", "Borja", "Aldo", "Bienvenido", "Brahim",
                "Aleix", "Blas", "Brais", "Alejandro", "Boris", "Bruno", "Alejo", "Borja", "Calisto", "Alex", "Brahim",
                "Juan", "José", "Alfonso", "Brais", "Camilo", "Alfredo", "Bruno", "Juan", "Manuel", "Alonso", "Calisto",
                "Carlos", "Álvaro", "Camilo", "Julio", "Amadeo", "Carlos", "Cayetano", "Amado", "Cayetano", "César",
                "Amando", "César", "Christian", "Ambrosio", "Christian", "Claudio", "Amin", "Claudio", "Clemente",
                "Anastasio", "Clemente", "Conrado", "Ander", "Conrado", "Constantino", "Constantino", "Francisco",
                "Javier", "Joel", "Crispín", "Francisco", "José", "Jon", "Cristian", "Gabriel", "Jordi", "Daniel",
                "Gaspar", "Jorge", "Darío", "Gerard", "José", "David", "Gerardo", "Jose", "Antonio", "Desiderio",
                "Germán", "Jose", "Luis", "Diego", "Gonzalo", "Jose", "Manuel", "Dionisio", "Gregorio", "Jose", "Maria",
                "Domingo", "Guillem", "Juan", "Donato", "Guillermo", "Juan", "Antonio", "Edgar", "Gustavo", "Juan",
                "Carlos", "Edmundo", "Hamza", "Juan", "José", "Eduardo", "Héctor", "Juan", "Manuel", "Elías",
                "Honorato", "Julio", "Eloy", "Hugo", "Justino", "Emilio", "Humberto", "Justo", "Eneko", "Ibai", "Kevin",
                "Enrique", "Ibrahim", "Kilian", "Eric", "Ignacio", "Leo", "Ernesto", "Iker", "Leopoldo", "Esteban",
                "Isidoro", "Lorenzo", "Eugenio", "Ismael", "Louis", "Eusebio", "Ivo", "Lucas", "Fabián", "Izan",
                "Luciano", "Federico", "Jaime", "Luis", "Felipe", "Jan", "Macario", "Félix", "Jaume", "Manuel",
                "Fermín", "Javier", "Marc", "Fernando", "Jesús", "Marcelo", "Fidel", "Joan", "Marco", "Francisco",
                "Joaquín", "Marcos", "Marcos", "Pau", "Tomás", "Mariano", "Pedro", "Ulises", "Mario", "Pelayo", "Unai",
                "Marti", "Plácido", "Urbano", "Martín", "Platón", "Valentín", "Mateo", "Pol", "Vicente", "Matías",
                "Ponce", "Víctor", "Mauricio", "Quintín", "Virgilio", "Maximiliano", "Rafael", "Walter", "Máximo",
                "Ramiro", "Wen", "Miguel", "Ramón", "Xabier", "Miguel", "Ángel", "Raúl", "Xavier", "Mikel", "Ricardo",
                "Ximen", "Mohamed", "Roberto", "Yerai", "Moisés", "Rodrigo", "Yeray", "Nabil", "Rogelio", "Yunes",
                "Narciso", "Román", "Yusef", "Nathan", "Rubén", "Zacarías", "Nicolás", "Salvador", "Zenon", "Noé",
                "Samuel", "Zoilo", "Octavio", "Santiago", "Oier", "Sebastián", "Omar", "Sergi", "Oriol", "Sergio",
                "Óscar", "Silvestre", "Pablo", "Simón", "Pancho", "Teodoro" };// Cierre del arreglo de nombres

        /**
         * Método que genera un nombre al azar del arreglo de nombres
         * 
         * @return Un nombre
         */
        public static String generaNombre() {
            return nombres[(int) (Math.random() * nombres.length)];
        }// Cierre de método genera nombres
    } // Cierre de la clase DiccionarioDeNombres

    /* Valor de salud del soldado */
    protected int vida;
    /* id único para cada soldado, no cambia */
    private final int id;
    /* distancia entre el soldado y su enemigo */
    protected int distancia;
    /* Define cómo ataca el soldado */
    protected Ataque ataque;
    /* Nombre del soldado */
    protected String nombre;
    /* Reporte del soldado */
    protected String reporte;
    /* Define cómo se mueve el soldado */
    protected Movimiento movimiento;

    /**
     * Constructor Soldado
     *
     * @param distancia La distancia inicial que tendrá el soldado
     * @param id        El id del soldado
     */
    protected Soldado(int distancia, int id) {
        this.distancia = distancia;
        this.id = id;
        this.nombre = DiccionarioDeNombres.generaNombre();
    }

    /**
     * Es un contructor que recibe un soldado
     * extrae sus caracteristicas y se las coloca a la instancia actual.
     * @param soldado
     */
    protected Soldado(Soldado soldado) {
        this.id = soldado.id;
        this.nombre = soldado.nombre;
        this.vida = soldado.vida;
        this.distancia = soldado.distancia;
        this.movimiento = soldado.movimiento;
        this.ataque = soldado.ataque;
        this.reporte = soldado.reporte;
    }

    /**
     * Método que inflige daño en un enemigo sólo si este se encuentra en rango El
     * daño está definido por el ataque que tenga el soldado
     * 
     * @param enemigo El enemigo que recibirá el ataque
     */
    @Override
    public void muestraAtaque(Enemigo enemigo) {
        if (vida > 0) {
            if (distancia == 0) {
                ataque.atacar(enemigo, this);
            } else {
                System.out.println("Mi nombre es " + nombre + " aun no llego con el enemigo por eso no puedo atacar ");
            }
        }
    }

    /**
     * Este método, indica el cargo del soldado, su id, la distancia a la que se
     * encuentran del enemigo y el HP de cada uno.
     */
    @Override
    public void muestraReporte() {
        if (vida > 0) {
            System.out.println("Mi nombre es " + nombre + " y me reporto como " + reporte);
        }
    }

    /**
     * Método que acerca al soldado a su enemigo La cantidad que se avance está
     * definido por el movimiento que tenga el soldado
     */
    @Override
    public void muestraMovimiento() {
        if (vida > 0) {
            if (distancia > 0) {
                movimiento.moverse(this);
                System.out.print(" y estoy a " + distancia + "km del enemigo \n");
            } else {
                System.out.println("Soy " + nombre + " y ya llegue con el enemigo, no puedo avanzar ");
            }
        }
    }

    /**
     * Método que disminuye la vida del soldado dependiendo de un cierto daño
     * infligido
     * 
     * @param vida El valor entero que indica el daño que se le hará al soldado
     */
    public void disminuirVida(int vida) {
        this.vida = Math.max(this.vida - vida, 0);
    }

    /**
     * Método que disminuye la distancia que separa al Soldado de su enemigo en
     * cierto valor
     * 
     * @param distancia La distancia a reducir
     */
    public void disminuirDistancia(int distancia) {
        this.vida = Math.max(this.vida - distancia, 0);
    }

    /**
     * Regresamos el nombre del soldado
     * 
     * @return El nomre del soldado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresamos el id del soldado
     * 
     * @return El id del soldado
     */
    public int getId() {
        return id;
    }

    /**
     * Regresamos la distancia entre el soldado y su enemigo
     * 
     * @return La distancia entre el soldado y su enemigo
     */
    public int getDistancia() {
        return distancia;
    }

}
