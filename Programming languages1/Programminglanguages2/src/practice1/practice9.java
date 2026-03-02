package practice1;

import java.util.ArrayList;

public class practice9 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Antalya");
        cities.add("Moscow");
        cities.add("Dubai");
        cities.add("Hong Kong");
        cities.add("Paris");

        System.out.println(cities);

        String[] array = new String[cities.size()];


        for (int i = 0; i < cities.size(); i++) {
            array[i] = cities.get(i);



            System.out.println(array[i]);
        }
    }
}