package spacecraft;
/**
 * En esta clase se trata de imitar los comportamientos y caracteristicas de una nave
 * tripulada
 * @author Jhon Anderson Galeano Santillana
 * @version 1.0.0
 * @see DataAccess
 * @see Count
 *
 */
public class mannedSpacecraft extends Count implements DataAccess {
    /**
     * @param name contiene el nombre de la nave
     * @param country contiene el país al que pertenece.
     * @param wight Contiene el peso de la nave
     * @param orbit la distancia que tiene la nave de la tierra
     *
     */
    private String name;
    private String country;
    protected float weight;
    protected float orbit;
    /**
     * @param CONTEO variable estandar hecha en la interfaz
     * @see DataAccess
     */
    private mannedSpacecraft() {
        super(CONTEO);
    }

    public mannedSpacecraft(String name, String country, float weight, float orbit) {
        this();
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.orbit = orbit;
    }

    @Override
    public void TakeOff() {
        System.out.println("Se ha desacoplado la nave tripulada "+this.name);

    }

    public String inOrbit(){
        return "Se encuentra en orbita a una distancia de "+this.orbit +" km de la tierra";

    }

    @Override
    public String land() {
        return "Se aterrizo la nave Tripulada "+this.name;
    }


}
