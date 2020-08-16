package ciencias.unam.modelado;

public class ReferenciaNumeroDoble{

    private double valor;

    public ReferenciaNumeroDoble(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void restar(double sustraendo) {
        this.valor = valor-sustraendo;
    }
}
