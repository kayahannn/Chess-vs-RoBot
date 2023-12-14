public class Rook extends Piece {

    public Rook(Color color, int x, int y) {
        super(color, x, y);

    }


    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        if (toX == fromX)
            return true;
        if (toY == fromY)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return null;
    }


    @Override
    public String getSymbol() {
        return "♜";
    }
}
