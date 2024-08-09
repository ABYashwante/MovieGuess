import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CreateList {

    public static List<String> AddToList() throws FileNotFoundException {

        File file = new File("D:/java pro/movies.txt");
        List<String> movieList = new ArrayList<>();

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String st = scan.nextLine();
            movieList.add(st);
        }
        scan.close();

        return movieList;
    }

}
