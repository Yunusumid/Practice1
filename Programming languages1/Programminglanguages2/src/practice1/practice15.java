package practice1;

import java.util.ArrayList;

public class practice15 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(8);
        numbers.add(20);
        numbers.add(17);
        numbers.add(5);
        numbers.add(65);
        numbers.add(3);

        System.out.println("Original numbers: " + numbers);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);

            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}



