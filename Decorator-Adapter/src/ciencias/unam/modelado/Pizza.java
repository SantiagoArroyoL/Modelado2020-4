package ciencias.unam.modelado;

import ciencias.unam.modelado.ingredientesCangrejo.*;

public abstract class Pizza {
    protected Carne carne;
    protected Queso queso;
    protected Masa masa;

    public Carne getCarne() {
        return carne;
    }

    public Masa getMasa() {
        return masa;
    }

    public Queso getQueso() {
        return queso;
    }

}
