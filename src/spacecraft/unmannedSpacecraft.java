package spacecraft;

/**
 * En esta clase se trata de imitar los comportamientos y caracteristicas de una nave no
 * tripulada
 *
 * @author Jhon Anderson Galeano Santillana
 * @version 1.0.0
 * @see DataAccess
 * @see Count
 */
public class unmannedSpacecraft extends Count implements DataAccess {

    protected double displacement;

    protected double thrust;
    private String name;
    private String country;

    private unmannedSpacecraft()  {
        super(CONTEO);
    }

    /**
     * Instantiates a new No tripulados.
     *
     * @param displacement el desplzamiento que adquiere la nave al estar
     *                       en orbita terrestre
     * @param thrust         el empuje de la nave
     * @param name           el nombre de la nave
     * @param country         el pais de la nave
     */
    public unmannedSpacecraft(double displacement, double thrust, String name, String country){
        this();
        this.displacement = displacement;
        this.thrust = thrust;
        this.name=name;
        this.country= this.country;
    }

    /**
     * devuelve desplazamiento.
     *
     * @return el desplazamiento
     */
    public double getDisplacement() {
        return displacement;
    }

    public void TakeOff(){
        super.contar();
        System.out.println("Su cohete no tripulado tuvo un Despegue exitoso");
    }

    public String land(){
        return "Se aterrizo la nave no tripulada "+this.name;
    }

}
