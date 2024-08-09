import java.util.*;

public class PickRandom {

    public static StringBuilder anonymous(String movieName){

        int len = movieName.length();
        StringBuilder dummy = new StringBuilder();
        for(int i=0; i<len; i++){
            if (movieName.charAt(i) == ' ')
            {
                dummy.append(" ");
            }
            else {
                dummy.append("_");
            }
        }
        System.out.println("the movie is: "+ movieName);
        System.out.println("your movie contains "+ len+" letters");
        System.out.println("you have 10 guesses. Start guessing!!!");
        System.out.println(dummy);

        return dummy;

    }

}
