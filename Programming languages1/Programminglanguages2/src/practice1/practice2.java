package practice1;

import java.util.ArrayList;
import java.util.Collections;

public class practice2 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        movies.add("Avatar");
        movies.add("Aladdin");
        movies.add("Wicked");
        movies.add("Inception");
        movies.add("Cars");


        System.out.println("Movies: " + movies);

        String longest = movies.get(0);

        for (int i = 1; i < movies.size(); i++) {
            if (movies.get(i).length() > longest.length()) {
                longest = movies.get(i);
            }
        }

        System.out.println("Shortest song title: " + longest);
        System.out.println("Length: " + longest.length() + " characters");
    }
}
