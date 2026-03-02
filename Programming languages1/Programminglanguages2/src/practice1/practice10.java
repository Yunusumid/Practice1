package practice1;

import java.util.ArrayList;

public class practice10 {
    public static void main(String[] args) {
        Integer[] numberArray = {4, 76, 32, 75, 64, 25};

        ArrayList<Integer> numberList = new ArrayList<>();

        // 3. Iterate through the array manually and add each element
        for (int i = 0; i < numberArray.length; i++) {
            // Add the element at the current index 'i' to the ArrayList
            numberList.add(numberArray[i]);
        }

        // 4. (Optional) Print the results to verify
        System.out.println("Original Array: ");
        for (int number : numberArray) {
            System.out.print(number + " ");
        }
        System.out.println("Converted ArrayList: ");
        System.out.println(numberList);
    }
}

