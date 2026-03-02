package practice1;

import java.util.ArrayList;

public class practice14 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("World");
        words.add("Java");
        words.add("Programming");
        words.add("ArrayList");

        System.out.println("Original words: " + words);

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String newWord = "";

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    newWord = newWord + '*';
                } else {
                    newWord = newWord + c;
                }
            }

            words.set(i, newWord);
        }

        System.out.println("After replacing vowels: " + words);
    }
}

