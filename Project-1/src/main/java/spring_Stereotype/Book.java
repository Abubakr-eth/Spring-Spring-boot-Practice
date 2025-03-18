package spring_Stereotype;

public class Book {
    String title;
    String author;
    Book(String title, String author){
        this.author=author;
        this.title=title;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
}
