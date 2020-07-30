package ciencias.unam.modelado.estrategias.salida;

public class SalidaEspanol implements IEstrategiaSalida {

    @Override
    public void muestraSalida(String destinatario, String remitente) {
        System.out.println(destinatario+":(Ostias! "+remitente+" ha salido)");
    }

}
