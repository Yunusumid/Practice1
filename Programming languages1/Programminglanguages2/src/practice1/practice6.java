package practice1;

import java.util.ArrayList;

public class practice6 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> sportsFull = new ArrayList<ArrayList<String>>();

        ArrayList<String> sports = new ArrayList<>();


        sports.add("Bowling");

        sports.add("Volleyball");

        ArrayList<String> sportssmall = new ArrayList<>();
        sportssmall.add("Tennis");
        sportssmall.add("Football");

        sportsFull.add(sports);
        sportsFull.add(sportssmall);

        System.out.println(sportsFull);
    }
}
