package nave;

public class Lanzadera implements AccesoDatos {
    private String name;
    private String country;
    private int empuje;
    private int peso;
    private int capTrans;// capacidad de transporte en orbita baja
    private int altura;
    private int potencia;


    public void insertar(){
        System.out.println("se inserto");

    }
    public void listar(){
        System.out.println("se listo");
    }

}
/**
 * tres tipos de vehiculos: lanzadera, no tripuladas o roboticas
 * y tripuladas
 */