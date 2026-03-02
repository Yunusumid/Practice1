package practice1;

import java.util.ArrayList;

public class practice5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("White");

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
            System.out.println(colors);
        }
    }
}