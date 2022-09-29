package nave;

public class Lanzadera implements AccesoDatos {
    private String name;
    private String country;
    private int empuje;
    private int peso;
    private int capTrans;// capacidad de transporte en orbita baja
    private int altura;
    private int potencia;


    public void despegar(){
        System.out.println("se despegó");

    }

    @Override
    public void aterrizar() {
        System.out.println("se aterrizo");
    }
}
/**
 * tres tipos de vehiculos: lanzadera, no tripuladas o roboticas
 * y tripuladas
 */