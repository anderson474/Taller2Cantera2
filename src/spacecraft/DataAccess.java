package spacecraft;

/**
 * En esta interfaz se declaran los contratos de las clases
 * @author Jhon Anderson Galeano Santillana
 * @version 1.0.0
 */
public interface DataAccess {
    /**
     * @param VELOCIDAD_DE_ESCAPE es la constante de la velocidad necesaria
     *                            para salir de la atmosfera.
     * @param CONTEO es donde todos los despegues empiezan su conteo.
     */
    public static final double VELOCIDAD_DE_ESCAPE= 11.19;//  km/s
    public static final int CONTEO=3;

    /**
     * El metodo take off es la acción de despegar
     * de cada nave
     */

    void TakeOff();

    /**
     * El metodo aterriza una nave
     * @return una cadena que contiene el aterrizaje y el nombre
     * de la nave
     */
    String land();
    /**
     * NOTA:
     * Los metodos abstractos de la interfaz
     * solo se coloca void pero en realidad son public y abstract y asi lo toma el compilador.
     *
     */

}
