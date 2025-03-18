package spring_Stereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookManagementApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BookManagementConfig.class);

        BookController controller = context.getBean(BookController.class);
        SimpleLogger logger = context.getBean(SimpleLogger.class);

        logger.log("Starting Book Management Application");

        controller.addBook("1984", "George Orwell");
        controller.addBook("To Kill a Mockingbird", "Harper Lee");

        controller.listBooks();

        logger.log("Book Management Application Ended");

        context.close();
    }
}