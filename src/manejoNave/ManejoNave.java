package manejoNave;
import nave.*;

public class ManejoNave {
    public static void main(String[] args) {
        boolean turn=true;
        while (turn){
            turn = Preguntar.pregunta();
            if(turn){
                AccesoDatos cohe1 = new Lanzadera("Saturno V.","USA",
                        3500, 2900, 118,
                        100, 32000);
                System.out.println("Despegue");
                cohe1.despegar();
            }




        }



    }
}
