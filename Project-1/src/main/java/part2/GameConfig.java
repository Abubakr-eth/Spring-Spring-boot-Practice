package part2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfig {

    @Bean
    public Pacman pacman(){
        return new Pacman(0,0);
    }
    @Bean
    public GameBoard smallGameBoard() {
        return new SmallgameBoard();
    }

    @Bean
    @Primary
    public GameBoard largeGameBoard() {
        return new LargeGameBoard();
    }
    @Bean
    public PacmanGame pacmangame(Pacman pacman,@Qualifier("smallGameBoard") GameBoard gameboard){
        return new PacmanGame(pacman,gameboard);
    }
}
