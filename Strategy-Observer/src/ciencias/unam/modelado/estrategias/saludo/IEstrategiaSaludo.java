package ciencias.unam.modelado.estrategias.saludo;

/**
 *
 * Estrategia para que un usuario reciba el aviso de que otro usuario se unió al chat
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @since 30-07-2020
 */
public interface IEstrategiaSaludo {

    /**
     * El método imprime por la terminal el nombre del usuario seguido del anuncio
     * de que otro usuario se unió al chat (incluyendo el nombre)
     * @param destinatario El nombre del usuario
     * @param remitente El nombre del usuario que se unió al chat
     */
    public void muestraSaludo(String destinatario, String remitente);
}
