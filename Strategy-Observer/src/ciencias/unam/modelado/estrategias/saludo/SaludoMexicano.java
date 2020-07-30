package ciencias.unam.modelado.estrategias.saludo;

public class SaludoMexicano implements IEstrategiaSaludo {
    @Override
    public void muestraSaludo(String destinatario, String remitente) {
        System.out.println(destinatario+":("+remitente+" entro a la sala)");
    }
}
