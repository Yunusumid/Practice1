package practice1;

import java.util.ArrayList;

public class practice19 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Peach");
        fruits.add("Watermelon");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Kiwi");

        System.out.println("Original fruits: " + fruits);

        ArrayList<Integer> lengths = new ArrayList<>();

        for (int i = 0; i < fruits.size(); i++) {
            int length = fruits.get(i).length();
            lengths.add(length);
        }

        System.out.println("Lengths: " + lengths);
    }
}


