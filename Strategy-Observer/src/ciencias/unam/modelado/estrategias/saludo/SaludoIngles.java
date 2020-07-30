package ciencias.unam.modelado.estrategias.saludo;
public class SaludoIngles implements IEstrategiaSaludo {
    @Override
    public void muestraSaludo(String destinatario, String remitente) {
        System.out.println(destinatario+":("+remitente+" has entered the chat)");
    }
}
