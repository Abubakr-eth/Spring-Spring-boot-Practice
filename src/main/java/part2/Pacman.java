package part2;

public class Pacman {
    private int x;
    private int y;

    Pacman(int x, int y){
        this.x=x;
        this.y=y;
    }

    void moveUp(){
        y++;
    }
    void moveDown(){
        y--;
    }
    void moveRight(){
        x++;
    }
    void moveLeft(){
        x--;
    }
    void position(){
        System.out.println(" the position of player is "+ x + " on x axis and "+ y+ " on y axis");
    }
}
