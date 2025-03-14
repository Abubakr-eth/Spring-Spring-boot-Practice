package part2;

public class SmallgameBoard implements GameBoard{
    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 10;
    }

    @Override
    public String getBoardType() {
        return "small";
    }
}
