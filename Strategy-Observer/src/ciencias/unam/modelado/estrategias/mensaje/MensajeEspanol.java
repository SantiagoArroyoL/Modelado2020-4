package ciencias.unam.modelado.estrategias.mensaje;


public class MensajeEspanol implements IEstrategiaMensaje{

    @Override
    public void muestraMensaje(String destinatario, String remitente, String mensaje) {
        System.out.println(destinatario+":"+ "("+remitente+" envio un mensaje para un español)"+mensaje);
    }
}
