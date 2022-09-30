package nave;

public interface AccesoDatos {
    public static final double VELOCIDAD_DE_ESCAPE= 11.19;//  km/s
    public static final int CONTEO=3;

    /**
     * Los metodos abstractos de la interfaz
     * solo se coloca void pero en realidad son public y abstract y asi lo toma el compilador.
     */
    void despegar();
    void aterrizar();

}
