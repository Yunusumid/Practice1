 package practice1;

 import java.util.ArrayList;

 public class practice20 {
    public static void main(String[] args) {
        // Указываем тип при создании!
        ArrayList<ArrayList<String>> company = new ArrayList<ArrayList<String>>();

        ArrayList<String> engineering = new ArrayList<String>();
        engineering.add("Alice");
        engineering.add("Bob");
        engineering.add("Chloe");

        ArrayList<String> marketing = new ArrayList<String>();
        marketing.add("David");
        marketing.add("Emma");

        ArrayList<String> sales = new ArrayList<String>();
        sales.add("Moris");
        sales.add("Grace");
        sales.add("Henry");
        sales.add("Iris");

        company.add(engineering);
        company.add(marketing);
        company.add(sales);

        System.out.println("Company structure:");
        System.out.println("Department 1 (Engineering): " + company.get(0));
        System.out.println("Department 2 (Marketing): " + company.get(1));
        System.out.println("Department 3 (Sales): " + company.get(2));

        System.out.println("Detailed view:");
        for (int i = 0; i < company.size(); i++) {
            System.out.println("Department " + (i + 1) + ":");
            ArrayList<String> department = company.get(i);

            for (int j = 0; j < department.size(); j++) {
                System.out.println("  - " + department.get(j));
            }
        }
    }
 }

