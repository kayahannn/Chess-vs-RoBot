public class Bishop extends Piece{


    public Bishop(Color color, int x, int y) {
        super(color, x, y);

    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if(toX - fromX == toY - fromY)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "Bishop";
    }

    @Override
    public String getSymbol() {
        return "♝";
    }

}
