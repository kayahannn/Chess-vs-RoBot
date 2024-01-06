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
        if(Math.abs(fromX - toX) == 2 && Math.abs(fromY -toY) == 1){
            return true;
        }
        if(Math.abs(fromY - toY) == 2 && Math.abs(fromX -toX) == 1){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Knight";
    }

}