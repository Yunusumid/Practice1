package practice1;

import java.util.ArrayList;

public class practice1 {
public static void main(String[] args) {
    ArrayList<String> booksFirst = new ArrayList<>();


    booksFirst.add("Little witch");
    booksFirst.add("Lolita");
    booksFirst.add("Bug hunt");
    booksFirst.add("Mockingbird");
    booksFirst.add("Snail");

    ArrayList<String> booksSecond = new ArrayList<>();


    booksSecond.add("Sword");
    booksSecond.add("The Odyssey");
    booksSecond.add("Undying Fire");
    booksSecond.add("Mockingbird");
    booksSecond.add("Matilda");

    booksFirst.remove("Mockingbird");
    booksSecond.remove("Mockingbird");

    ArrayList<String> booksFull = new ArrayList<>();

    booksFull.add("Little witch");
    booksFull.add("Lolita");
    booksFull.add("Bug hunt");
    booksFull.add("Snail");
    booksFull.add("Sword");
    booksFull.add("The Odyssey");
    booksFull.add("Undying Fire");
    booksFull.add("Matilda");

    System.out.println(booksFull);
}
}




