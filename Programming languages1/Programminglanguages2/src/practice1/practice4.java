package practice1;

import java.util.ArrayList;

public class practice4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Watermelon");
        fruits.add("Banana");

        System.out.println(fruits);

        fruits.remove("Banana");
        fruits.remove("Banana");
        fruits.remove("Banana");

        System.out.println(fruits);
    }
}
