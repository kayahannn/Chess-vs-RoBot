public class Pawn extends Piece {
    public Pawn(Color color, int x, int y) {
        super(color, x, y);
    }

    public String getSymbol() {
        return "♟";
    }

    @Override
    public String toString() {
        return "Pawn";
    }

    @Override
    public boolean isValid(int fromX, int fromY, int toX, int toY) {
        if(!super.isValid(fromX, fromY, toX, toY))
            return false;
        if(Math.abs(fromY - toY) != 0){
            return false;
        }
        if (Math.abs(fromX - toX) != 1)
            return false;

        return true;

    }
}
