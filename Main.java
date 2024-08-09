
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        "D:\java pro\movies.txt"
        try {

            List<String> movieList = CreateList.AddToList();    // returns the movie list
            String movieName = MovieName.getIndex(movieList);
            StringBuilder dummy = PickRandom.anonymous(movieName);
            MovieProceed.movieGuessed(movieName, dummy);

        } catch(FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

    }
}

