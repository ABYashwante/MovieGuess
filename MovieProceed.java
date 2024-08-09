import java.util.Scanner;

public class MovieProceed {

    public static void movieGuessed(String movieName, StringBuilder dummy)
    {
        Scanner userScanner = new Scanner(System.in);
        int gusses = 10;
        while(gusses != 0)
        {
            System.out.println("Remaining guesses: " + gusses);
            System.out.println("Enter the next character: ");
            String ch = userScanner.nextLine();
            String ch1 = ch.toLowerCase();
            if(ch1.length() != 1){
                System.out.println("Please enter only 1 character !!!");
                gusses--;
                System.out.println("Remaining guesses: " + gusses);
            }
            else {

                if (guess_movie.isPresent(movieName, ch1))
                {
                    dummy = guess_movie.ifPresent(movieName, dummy, ch1);
                    System.out.println("dummy: "+ dummy);
//                movieName.equals(dummy)
                    String sb = dummy.toString();
                    if (movieName.equals(sb))
                    {
                        System.out.println("Congrats you won!!!");
                        break;
                    }
                }
                else {
                    gusses--;
                    System.out.println(dummy);
                    System.out.println("Remaining guesses: " + gusses);
                }

            }


        }
        userScanner.close();

        if(gusses == 0)
        {
            System.out.println("You Lost!!!!");
        }



    }

}
