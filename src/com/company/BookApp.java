package com.company;
/**
 * Create a project in IntelliJ called BookApplication.
 * <p>
 * Create a Book class that allows for Book title, author, description, price and isInStock variables
 * <p>
 * The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method
 * called getDisplayText() which prints the author, title and description.
 * <p>
 * <p>
 * The application shall also contain getters and setters for each private member variable.
 * <p>
 * Create another class called BookApp which contains the main method. In the main method you shall create an instance
 * of a Book and print the Author, Title and Description.
 * <p>
 * Publish your solution to GitHub and submit your GitHub url as the assignment.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return $100,
 * if they are in stock. If they are not in stock, that should be handled appropriately (hint - you decide).</p>
 *
 */
public class BookApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("OCA", "Jeanne Boyarsky", "OCAJP Exam guide", 20, true));
        books.add(new Book("OCP", "Jeanne Boyarsky", "OCPJP Exam guide", 20, true));
        books.add(new Book("OCA & OCP", "Mala Gupta", "OCA OCP JP Exam guide", 20, false));
        books.add(new Book("Java 5", "Ivor Hornton", "Basic Java", 20, true));
        books.add(new Book("Oracle Tutorial", "Oracle Press", "OCA OCP JP Exam guide", 20, true));
        books.add(new Book("Head First in Java", "Jeanne Boyarsky", "Servlet & JSP", 20, false));
        books.add(new Book("Java For Dummies", "John", "Basic Java", 20, true));

        BookApp app = new BookApp();
        System.out.println("The total is: " + app.getTotal(books));
    }

    public double getTotal(List<Book> books) {
        double sum = 0.0;
        for (Book book : books) {
            if (book.isInStock()) {
                sum += book.getPrice();
            } else {
                System.out.println(book.getTitle() + " is out of stock");
            }
        }
        return sum;
    }
}
