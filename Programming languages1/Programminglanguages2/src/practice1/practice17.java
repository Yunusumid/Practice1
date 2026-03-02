package practice1;

import java.util.ArrayList;

public class practice17 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alan");
        names.add("Lisa");
        names.add(null);
        names.add("Jeff");
        names.add("Clara");
        names.add(null);

        System.out.println("Original list: " + names);

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i) == null) {
                names.remove(i);
                i--;
            }
        }

        System.out.println("After removing null values: " + names);
    }
}


