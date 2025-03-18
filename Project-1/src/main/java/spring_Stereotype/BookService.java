package spring_Stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookRepository.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getBooks();
    }
}