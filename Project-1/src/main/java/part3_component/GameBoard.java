package part3_component;

import org.springframework.stereotype.Component;

@Component
public class GameBoard {
    private int width;
    private int height;

    public GameBoard() {
        this.width = 20;
        this.height = 20;
    }

    public String getBoardSize() {
        return "Board size is " + width + "x" + height;
    }
}