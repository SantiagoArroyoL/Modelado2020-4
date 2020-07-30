package ciencias.unam.modelado.estrategias.mensaje;

public class MensajeMexicano implements IEstrategiaMensaje {

    @Override
    public void muestraMensaje(String destinatario, String remitente, String mensaje) {
        System.out.println(destinatario+":"+ "("+remitente+" ha enviado un mensaje)"+mensaje);
    }

}
