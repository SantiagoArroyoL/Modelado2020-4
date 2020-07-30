package ciencias.unam.modelado.estrategias.saludo;

public class SaludoEspanol implements IEstrategiaSaludo {

    @Override
    public void muestraSaludo(String destinatario, String remitente) {
        System.out.println(destinatario+":("+remitente+" ha entrado a la sala)");
    }

}
