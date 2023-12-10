public abstract class Piece {
    protected Color color;
    protected int x;
    protected int y;

    public Piece(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }


    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (toX == fromX && toY == fromY)
            return false;
        if (toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY < 0 || fromY > 7)
            return false;
        return true;
    }

    public abstract String toString();

    public abstract String getSymbol();

    protected Object getColor() {
        return this.color;
    }
}