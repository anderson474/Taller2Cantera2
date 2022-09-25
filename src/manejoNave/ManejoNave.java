package manejoNave;
import nave.*;

public class ManejoNave {
    public static void main(String[] args) {
        AccesoDatos nave1 = new Lanzadera();
        nave1.listar();
        nave1.insertar();

    }
}
