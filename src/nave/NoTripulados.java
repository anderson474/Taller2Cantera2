package nave;

public class NoTripulados extends conteo implements AccesoDatos{
    protected double desplazamiento;
    protected double empuje;
    private String name;
    private String country;

    private NoTripulados()  {
        super(CONTEO);
    }

    public NoTripulados(double desplazamiento, double empuje, String name, String contry){
        this();
        this.desplazamiento=desplazamiento;
        this.empuje=empuje;
        this.name=name;
        this.country=country;
    }


    public void despegar(){
        super.contar();
        System.out.println("Su cohete no tripulado tuvo un Despegue exitoso");
    }

    public void aterrizar(){
        System.out.println("Se aterrizo");
    }

}
