package ciencias.unam.modelado.estrategias.salida;

public class SalidaIngles implements IEstrategiaSalida {

    @Override
    public void muestraSalida(String destinatario, String remitente) {
        System.out.println(destinatario+":("+remitente+"has left the chat)");
    }
}
