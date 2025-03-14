package part2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PacmanApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(GameConfig.class);
        PacmanGame game = context.getBean(PacmanGame.class);

        game.printGameState();
        game.move("right");
        game.move("down");
        game.move("left");
        game.move("up");

        context.close();
    }
}
