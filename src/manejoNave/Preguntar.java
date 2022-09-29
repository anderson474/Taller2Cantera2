package manejoNave;

import java.util.Scanner;

public class Preguntar {
    private static String entradaTeclado;

    public static boolean pregunta(){
        System.out.println("Desea Continuar el juego?");
        Scanner entrada = new Scanner(System.in);
        entradaTeclado = entrada.nextLine();
        var respuesta = identResp(entradaTeclado);
        return respuesta;

    }

    public static boolean identResp(String entrada){//identifica la respuesta
        entrada=new String(entrada);
        if("si".equals(entrada)){
            return true;
        }
        else if("Si".equals(entrada)){
            return true;
        }
        else if("SI".equals(entrada)){
            return true;
        }
        else if("no".equals(entrada)){
            return false;
        }
        else if("No".equals(entrada)){
            return false;
        }
        else if("NO".equals(entrada)){
            return false;
        }
        else{
            return false;
        }

    }


}
