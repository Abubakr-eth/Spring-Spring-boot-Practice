package spring_Stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(String title, String author) {
        bookService.addBook(title, author);
        System.out.println("Book added via controller: " + title);
    }

    public void listBooks() {
        List<Book> books = bookService.getAllBooks();
        System.out.println("All books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}