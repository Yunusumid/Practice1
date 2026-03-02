package practice1;

import java.util.ArrayList;

public class practice13 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();

        songs.add("Bohemian Rhapsody");
        songs.add("Fireworks");
        songs.add("Never Enough");
        songs.add("Shape of you");
        songs.add("Imagine");
        songs.add("Yesterday");

        System.out.println("Songs: " + songs);
        String shortest = songs.get(0);

        for (int i = 1; i < songs.size(); i++) {
            if (songs.get(i).length() < shortest.length()) {
                shortest = songs.get(i);
            }
        }

        System.out.println("Shortest song title: " + shortest);
        System.out.println("Length: " + shortest.length() + " characters");
    }
}


