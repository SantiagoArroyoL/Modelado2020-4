package ciencias.unam.modelado.estrategias.salida;

/**
 *
 * Estrategia para que un usuario Español reciba el aviso de que otro usuario salió del chat
 *
 * @author Arroyo Lozano Santiago
 * @author González Domínguez Saúl Fernando
 * @see IEstrategiaSalida
 * @since 30-07-2020
 */
public class SalidaEspanol implements IEstrategiaSalida {

    /**
     * El método imprime por la terminal el nombre del usuario seguido del anuncio
     * de que otro usuario abandonó el chat (incluyendo su nombre)
     * @param destinatario El nombre del usuario
     * @param remitente El nombre del usuario que salió del chat
     */
    @Override
    public void muestraSalida(String destinatario, String remitente) {
        System.out.println(destinatario+":(Ostias! "+remitente+" ha salido)");
    }

}
