package part2;

public class LargeGameBoard implements GameBoard{
    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 20;
    }

    @Override
    public String getBoardType() {
        return "large";
    }
}
