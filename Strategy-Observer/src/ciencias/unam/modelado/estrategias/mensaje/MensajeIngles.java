package ciencias.unam.modelado.estrategias.mensaje;

public class MensajeIngles implements IEstrategiaMensaje {

    @Override
    public void muestraMensaje(String destinatario, String remitente, String mensaje) {
        System.out.println(destinatario+":"+ "("+remitente+" has sent a message)"+mensaje);
    }
}
