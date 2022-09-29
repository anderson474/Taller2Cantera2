package nave;

public class Lanzadera extends nave.conteo implements AccesoDatos {
    private String name;
    private String country;
    private int empuje;
    private int peso;
    private int capTrans;// capacidad de transporte en orbita baja
    private int altura;
    private int potencia;
    private static final int CONTEO=3;



    private Lanzadera()  {
        super(CONTEO);
    }

    public Lanzadera(String name, String country, int empuje, int peso, int capTrans, int altura, int potencia) {
        this();
        this.name=name;
        this.country=country;
        this.empuje=empuje;
        this.peso=peso;
        this.capTrans=capTrans;
        this.altura=altura;
        this.potencia=potencia;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void despegar(){
        super.contar();
        
    }

    @Override
    public void aterrizar() {
        System.out.println("se aterrizo");
    }
}
