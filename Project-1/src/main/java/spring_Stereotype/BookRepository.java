package spring_Stereotype;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//this means the data repository , incoming , outgoing , storage of data - the class responsible for it will have this annotation
public class BookRepository {
    public static List<Book> books=new ArrayList<>();
    void addBook(Book book) {
        books.add(book);
    }
    List<Book> getBooks(){
        return books;
    }
}
