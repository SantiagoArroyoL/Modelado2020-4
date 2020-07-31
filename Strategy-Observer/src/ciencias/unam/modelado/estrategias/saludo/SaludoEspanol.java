package ciencias.unam.modelado.estrategias.saludo;

/**
 *
 * Estrategia para que un usuario Español reciba el aviso de que otro usuario se unió al chat
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see IEstrategiaSaludo
 * @since 30-07-2020
 */
public class SaludoEspanol implements IEstrategiaSaludo {

    /**
     * El método imprime por la terminal el nombre del usuario seguido del anuncio
     * de que otro usuario se unió al chat (incluyendo el nombre)
     * @param destinatario El nombre del usuario
     * @param remitente El nombre del usuario que se unió al chat
     */
    @Override
    public void muestraSaludo(String destinatario, String remitente) {
        System.out.println(destinatario+":("+remitente+" ha entrado a la sala)");
    }

}
