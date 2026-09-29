class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    public Book(int bookId, String title, String author, String category, double price, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("-----------------------------------");
    }
}

public class Exp1_LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", "James Gosling", "Technology", 45.50, true);
        Book book2 = new Book(102, "Data Structures", "Mark Allen", "Education", 55.00, false);

        System.out.println("=== Library Book Details ===");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}