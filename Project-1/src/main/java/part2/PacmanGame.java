package part2;

public class PacmanGame {
    Pacman pacman;
    GameBoard gameboard;
    PacmanGame(Pacman pacman, GameBoard gameboard){
        this.pacman=pacman;
        this .gameboard=gameboard;
    }
    public void move(String direction){
        switch(direction.toLowerCase()){
            case "up":
                pacman.moveUp();
            case "down":
                pacman.moveDown();
            case "right":
                pacman.moveRight();
            case "left":
                pacman.moveLeft();

            default:
                System.out.println("give proper direction");

        }
        pacman.position();
    }
    void printGameState(){
        gameboard.getBoardType();
        pacman.position();
    }
}
