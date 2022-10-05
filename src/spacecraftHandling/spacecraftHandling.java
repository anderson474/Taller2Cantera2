package spacecraftHandling;
import spacecraft.*;

/**
 * En esta clase se va a tratar de manipular las cuatro naves espaciales
 * @author Jhon Anderson Galeano Santillana
 * @version 1.0.0
 */
public class spacecraftHandling {
    public static void main(String[] args) {
        boolean turn = true;
        while (turn) {
            System.out.println("Desea Continuar el juego?");
            turn = Ask.Asking();
            if (turn) {
                System.out.println("Desea lanzar la lanzadera saturno?");
                var shuttle = Ask.Asking();
                if (shuttle) {
                    DataAccess cohe1 = new shuttle("Saturno V.", "USA",
                            3500, 2900, 118,
                            100, 32000);
                    System.out.println("Despegue");
                    cohe1.TakeOff();

                    System.out.println("Desea Expulsar las naves tripulada?");
                    var eject = Ask.Asking();
                    if (eject) {

                        System.out.println("Desea lanzar el Skilab?");
                        var skilab = Ask.Asking();
                        if (skilab) {
                            DataAccess cohe2 = new mannedSpacecraft("Skilab", "USA", 77, 435);
                            cohe2.TakeOff();
                            System.out.println(((mannedSpacecraft) cohe2).inOrbit());
                            System.out.println("Desea aterrizar lanave skilab");
                            var land2 = Ask.Asking();
                            if (land2) {
                                System.out.println(cohe2.land());

                            }

                            System.out.println("Desea lanzar el Salyut?");
                            var salyut = Ask.Asking();
                            if (salyut) {
                                DataAccess cohe3 = new mannedSpacecraft("salyut", "Sovietico", 19.8f
                                        , 248.9f);
                                cohe2.TakeOff();
                                System.out.println(((mannedSpacecraft) cohe3).inOrbit());
                                System.out.println(cohe1.land());
                                System.out.println("Desea aterrizar la nave salyut");
                                var aterrizar3 = Ask.Asking();
                                if (aterrizar3) {
                                    System.out.println(cohe3.land());

                                }

                            }

                        } else {
                            System.out.println("Se ha alcanzado la velocidad de escape: " +
                                    DataAccess.VELOCIDAD_DE_ESCAPE);
                            System.out.println("Y se encuentra en orbita con una capacidad de carga de: " +
                                    ((shuttle) cohe1).getCapTrans());

                        }


                    }
                }
                System.out.println("Desea lanzar la nave Cassini-Huygens?");
                var Notripulada = Ask.Asking();
                if (Notripulada) {
                    DataAccess cohe4 = new unmannedSpacecraft(45.39, 18000, "Cassini-Huygens",
                            "USA,ESA,ASI");
                    System.out.println("Despegue");
                    cohe4.TakeOff();

                    System.out.println("Desea aterrizar?");
                    var aterrizar4 = Ask.Asking();
                    if (aterrizar4) {
                        System.out.println(cohe4.land());
                    } else {
                        System.out.println("Se ha alcanzado la velocidad de escape: " +
                                DataAccess.VELOCIDAD_DE_ESCAPE);
                        unmannedSpacecraft cohe41 = (unmannedSpacecraft) cohe4;
                        System.out.println("se quedo desplazandose a una velocidad de "+cohe41.getDisplacement()+" km/h");

                    }
                }


            }
        }
    }
}
