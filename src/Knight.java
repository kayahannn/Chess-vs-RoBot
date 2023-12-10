public class Knight extends Piece{

    public Knight(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public String getSymbol() {
        return "♞";
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if(toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2)
            return false;
        if(toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return null;
    }

}