package nave;

public interface AccesoDatos {
    int MAX_DATOS=10;

    /**
     * Los metodos abstractos de la interfaz
     * solo se coloca void pero en realidad son public y abstract y asi lo toma el compilador.
     */
    void despegar();
    void aterrizar();

}
