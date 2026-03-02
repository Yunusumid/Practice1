package practice1;

import java.util.ArrayList;

public class practice11 {
    public static void main(String[] args) {
        ArrayList<String> countries1 = new ArrayList<>();

        countries1.add("Mexico");
        countries1.add("Canada");
        countries1.add("USA");
        countries1.add("Japan");
        countries1.add("France");

        ArrayList<String> countries2 = new ArrayList<>();

        countries2.add("Brazil");
        countries2.add("Germany");
        countries2.add("Japan");
        countries2.add("USA");
        countries2.add("India");

        ArrayList<String> commonList = new ArrayList<>();

        for (int i = 0; i < countries1.size(); i++) {
            String countryList = countries1.get(i);

            for (int j = 0; j < countries2.size(); j++) {
                if (countryList.equals(countries2.get(j))) {
                    commonList.add(countryList);
                    break;
                }
            }
        }

        System.out.println("First list: " + countries1);
        System.out.println("Second list: " + countries2);
        System.out.println("Common elements: " + commonList);
    }
}


