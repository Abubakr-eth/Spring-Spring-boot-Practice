package part3_component;

import org.springframework.stereotype.Component;

@Component
public class Pacman {
    private int x;
    private int y;

    public Pacman() {
        this.x = 0;
        this.y = 0;
    }

    public void moveUp() { y--; }
    public void moveDown() { y++; }
    public void moveLeft() { x--; }
    public void moveRight() { x++; }

    public String getPosition() {
        return "Pacman is at (" + x + ", " + y + ")";
    }
}