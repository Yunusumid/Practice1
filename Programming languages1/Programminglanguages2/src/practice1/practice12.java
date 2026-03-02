package practice1;

import java.util.ArrayList;

public class practice12 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Norman");
        names.add("Alice");
        names.add("Bob");
        names.add("Alex");
        names.add("Nicole");
        names.add("David");

        System.out.println("Original list: " + names);

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            if (name.length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }

        System.out.println("After removing even-length names: " + names);
    }
}



