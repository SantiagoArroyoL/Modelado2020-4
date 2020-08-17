package ciencias.unam.modelado;

/**
 *
 * Clas que encapsula un double con el objeto 
 * de pasarlo a traves de metodos por referencia
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 16-08-2020
 */
public class ReferenciaNumeroDoble{

    private double valor;

    /**
     * Constructor que inicializa el double
     * @param valor Es el double que encapsulamos para pasar por referencia
     */
    public ReferenciaNumeroDoble(double valor) {
        this.valor = valor;
    }

    /**
     * Es el metodo GET del atributo valor 
     * @return El atributo valor de tipo double
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * Es el metodo GET del atributo valor 
     * @param valor El atributo valor de tipo double
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Es un metodo creado como una sintaxis mas amigable
     * para restarle un numero al valor encapsulado
     * @param sustraendo Es la cantidad que se quiere sustraer del double
     */
    public void restar(double sustraendo) {
        this.valor = valor-sustraendo;
    }
}
