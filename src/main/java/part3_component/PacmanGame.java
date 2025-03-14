package part3_component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame {
    private final Pacman pacman;
    private final GameBoard gameBoard;

    @Autowired
    public PacmanGame(Pacman pacman, GameBoard gameBoard) {
        this.pacman = pacman;
        this.gameBoard = gameBoard;
    }

    public void play() {
        System.out.println(gameBoard.getBoardSize());
        System.out.println(pacman.getPosition());
        pacman.moveRight();
        System.out.println("After moving right: " + pacman.getPosition());
        pacman.moveDown();
        System.out.println("After moving down: " + pacman.getPosition());
    }
}