package part3_component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PacmanApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameConfig.class)) {
            PacmanGame game = context.getBean(PacmanGame.class);
            game.play();
        }
    }
}