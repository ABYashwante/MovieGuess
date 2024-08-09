import java.util.*;

public class guess_movie {

    public static int random(){
        Random random  = new Random();
        int randomnum = random.nextInt(25)+1;
        return randomnum;
    }

    public static boolean isPresent(String movieName, String ch){
        for (int i=0; i<movieName.length(); i++)
        {
            if(ch.charAt(0) == movieName.charAt(i))
            {
                return true;
            }
//            else{
//                return false;
//            }
        }
        return false;
    }

    public static StringBuilder ifPresent(String movieName, StringBuilder dummy, String ch)
    {
        for (int i=0; i<movieName.length(); i++)
        {
            if(ch.charAt(0) == movieName.charAt(i))
            {
                dummy.replace(i, i+1, ch);
            }
        }
        return dummy;
    }

}

