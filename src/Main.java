public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Curious Incident of the Dog in the Night-Time", " Mark Haddon", 226);
        Book book2 = new Book("The Unbearable Lightness of Being", " Milan Kundera", 314);
        Book book3 = new Book("The Zombie Room", "R.D. Ronald", 218);

        System.out.println();
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        System.out.println();
        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.returnBook();
        book2.displayInfo();

        System.out.println();
        book3.displayInfo();
        book3.borrowBook();
        book3.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}

class Book {
    String title, author;
    int pages;
    boolean isAvailable = true;

    Book(String T, String A, int P) {
        title = T;
        author = A;
        pages = P;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    void borrowBook() {
        isAvailable = false;
        System.out.println("You have borrowed '" + title + "'.");
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("You have returned '" + title + "'.");
    }
}
