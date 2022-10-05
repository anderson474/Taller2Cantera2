package spacecraft;

/**
 * En esta clase se trata de imitar los comportamientos y caracteristicas de una nave
 * que lleva naves tripuladas o conocida como lanzadera
 * @author Jhon Anderson Galeano Santillana
 * @version 1.0.0
 * @see DataAccess
 * @see Count
 */
public class shuttle extends Count implements DataAccess {
    private String name;
    private String country;
    private int thrust;
    private int weight;
    private int capTrans;
    private int height;
    private int power;




    private shuttle()  {
        super(CONTEO);
    }

    /**
     * Instantiates a new Lanzadera.
     *
     * @param name     el name
     * @param country  el pais
     * @param thrust    el empuje que tiene la nave
     * @param weight     el peso de la nave
     * @param capTrans capacidad de transporte en orbita baja
     * @param height   la altura de la lanzadera
     * @param power la potencia de la lanzadera
     */
    public shuttle(String name, String country, int thrust , int weight, int capTrans, int height, int power) {
        this();
        this.name=name;
        this.country=country;
        this.thrust =thrust ;
        this.weight = weight;
        this.capTrans=capTrans;
        this.height = height;
        this.power = power;
    }

    /**
     *
     * @return el nombre
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return el pais
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @return la capacidad de transporte en orbita baja
     */
    public int getCapTrans() {
        return capTrans;
    }

    public void TakeOff(){
        super.contar();
        System.out.println("Su lanzadera tuvo un Despegue exitoso");
    }

    @Override
    public String land() {
        return "se aterrizo la lanzadera "+this.name;
    }
}
