package ciencias.unam.modelado.estrategias.salida;

public class SalidaMexicano implements IEstrategiaSalida {

    @Override
    public void muestraSalida(String destinatario, String remitente) {
        System.out.println(destinatario+":("+remitente+" ha abandonado la sala)");
    }
}
