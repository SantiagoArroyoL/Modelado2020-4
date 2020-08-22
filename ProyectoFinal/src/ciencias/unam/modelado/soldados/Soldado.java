package ciencias.unam.modelado.soldados;

import ciencias.unam.modelado.Enemigo;
import ciencias.unam.modelado.ataques.Ataque;
import ciencias.unam.modelado.movimientos.Movimiento;

public class Soldado implements IObservador {

    private int id;
    protected String nombre;
    protected int vida;
    protected int distancia;
    protected Movimiento movimiento;
    protected Ataque ataque;
    protected String reporte;

    public Soldado(int distancia, int id) {
        this.distancia = distancia;
        this.id = id;
        this.nombre = DiccionarioDeNombres.generaNombre();
    }

    protected Soldado(Soldado soldado){
        this.id = soldado.id;
        this.nombre = soldado.nombre;
        this.vida = soldado.vida;
        this.distancia = soldado.distancia;
        this.movimiento = soldado.movimiento;
        this.ataque = soldado.ataque;
        this.reporte = soldado.reporte;
    }

    @Override
    public void muestraAtaque(Enemigo enemigo) {
        if(vida > 0){
            if(distancia == 0){
                ataque.atacar(enemigo, this);
            }else{
                System.out.println("Mi nombre es "+nombre+" aun no llego con el enemigo por eso no puedo atacar ");
            }  
        }
    }

    @Override
    public void muestraReporte() {
        if(vida > 0){
            System.out.println("Mi nombre es "+nombre+" y me reporto como "+reporte);
        }
    }

    @Override
    public void muestraMovimiento() {
        if(vida > 0){
            if(distancia > 0){
                movimiento.moverse(this);
                System.out.print(" y estoy a "+ distancia+ "km del enemigo \n");
            }else{
                System.out.println("Mi nombre es "+nombre+" y ya llegue con el enemigo entonces no me puedo mover ");
            }  
        }
    }

    public void disminuirVida(int vida){
        if(this.vida-vida <0){
            vida = 0;
        }else{
            this.vida -= vida;
        }
    }

    public void disminuirDistancia(int distancia){
        if(this.distancia-distancia<0){
            distancia = 0;
        }else{
            this.distancia -= distancia;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getDistancia() {
        return distancia;
    }

}
