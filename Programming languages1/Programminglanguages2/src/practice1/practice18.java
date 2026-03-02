package practice1;

import java.util.ArrayList;

public class practice18 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        movies.add("The Godfather");
        movies.add("Inception");
        movies.add("Life of Pi");
        movies.add("Titanic");
        movies.add("Fast and Furious");
        movies.add("Jaws");

        System.out.println("Movies: " + movies);

        String longest = "";
        String secondLongest = "";

        for (int i = 0; i < movies.size(); i++) {
            String movie = movies.get(i);

            if (movie.length() > longest.length()) {
                secondLongest = longest;
                longest = movie;
            } else if (movie.length() > secondLongest.length()) {
                secondLongest = movie;
            }
        }

        System.out.println("Longest: " + longest + " (" + longest.length() + " characters)");
        System.out.println("Second longest: " + secondLongest + " (" + secondLongest.length() + " characters)");
    }
}

