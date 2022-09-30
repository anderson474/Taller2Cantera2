package manejoNave;
import nave.*;

public class ManejoNave {
    public static void main(String[] args) {
        boolean turn=true;
        while (turn){
            System.out.println("Desea Continuar el juego?");
            turn = Preguntar.pregunta();
            if(turn){
                System.out.println("Desea lanzar la lanzadera saturno?");
                var lanzadera=Preguntar.pregunta();
                if(lanzadera){
                    AccesoDatos cohe1 = new Lanzadera("Saturno V.","USA",
                            3500, 2900, 118,
                            100, 32000);
                    System.out.println("Despegue");
                    cohe1.despegar();

                    System.out.println("Desea aterrizar?");
                    var aterrizar=Preguntar.pregunta();
                    if(aterrizar){
                        cohe1.aterrizar();
                    }
                    else{
                        System.out.println("Se ha alcanzado la velocidad de escape: "+AccesoDatos.VELOCIDAD_DE_ESCAPE);
                        System.out.println("Y se encuentra en orbita con una capacidad de carga de: "+ ((Lanzadera) cohe1).getCapTrans());
                    }
                }


            }




        }



    }
}
