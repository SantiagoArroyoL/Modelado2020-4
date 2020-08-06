package ciencias.unam.modelado.pizzasDonCangrejo.queso;

public class Manchego implements Queso{

    /**
     * Regresa el valor monetario del queso
     *
     * @return Número flotante (que puede ser entero) que indica el costo del queso
     */
    @Override
    public double getCostoQueso() {
        return 15;
    }

    /**
     * Regresa la descripción del queso, ya sea el nombre o algo más detallado
     *
     * @return Cadena conteniendo la descripción
     */
    @Override
    public String getDescripcionQueso() {
        return "Queso manchego";
    }
}
