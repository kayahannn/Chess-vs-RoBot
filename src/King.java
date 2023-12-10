public class King extends Piece{


    public King(Color color, int x, int y) {
        super(color, x, y);

    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        if(Math.sqrt(Math.pow(Math.abs((toX - fromX)),2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)){
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String getSymbol() {
        return "♚";
    }

}
