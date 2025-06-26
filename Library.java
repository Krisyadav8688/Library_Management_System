import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
