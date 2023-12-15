public class Pawn extends Piece {
    public Pawn(Color color, int x, int y) {
        super(color, x, y);
    }
    public String getSymbol(){
        return "♟";
    }

    @Override
    public String toString() {
        return "Pawn";
    }
}
