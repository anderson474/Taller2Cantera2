package nave;

public interface AccesoDatos {
    public static final double VELOCIDAD_DE_ESCAPE= 11.19;//  km/s

    /**
     * Los metodos abstractos de la interfaz
     * solo se coloca void pero en realidad son public y abstract y asi lo toma el compilador.
     */
    void despegar();
    void aterrizar();

}
