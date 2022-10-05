package spacecraftHandling;

import java.util.Scanner;

public class Ask {
    private static String keyword;

    public static boolean Asking(){

        Scanner entrance = new Scanner(System.in);
        keyword = entrance.nextLine();
        var answer = identAnswer(keyword);
        return answer;

    }

    public static boolean identAnswer(String entrance){//identifica la respuesta
        entrance=new String(entrance);
        if("si".equals(entrance)){
            return true;
        }
        else if("Si".equals(entrance)){
            return true;
        }
        else if("SI".equals(entrance)){
            return true;
        }
        else if("no".equals(entrance)){
            return false;
        }
        else if("No".equals(entrance)){
            return false;
        }
        else if("NO".equals(entrance)){
            return false;
        }
        else{
            return false;
        }

    }


}
