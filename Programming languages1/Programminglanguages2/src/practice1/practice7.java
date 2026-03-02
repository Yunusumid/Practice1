package practice1;

import java.util.ArrayList;

public class practice7 {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>();

        flowers.add("dahlia");
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("lily");
        flowers.add("rose");
        flowers.add("orchid");

        int First = flowers.indexOf("rose");
        int Last = flowers.lastIndexOf("rose");
        System.out.println(First);
        System.out.println(Last);

    }
}
