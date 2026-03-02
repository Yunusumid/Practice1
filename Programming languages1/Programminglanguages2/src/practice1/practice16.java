package practice1;

import java.util.ArrayList;

public class practice16 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("Original days: " + days);

        int rotations = 2;

        for (int i = 0; i < rotations; i++) {
            String first = days.get(0);
            days.remove(0);
            days.add(first);
        }

        System.out.println("After rotating by " + rotations + " positions: " + days);
    }
}


