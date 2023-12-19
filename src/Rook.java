public class Rook extends Piece {

    public Rook(Color color, int x, int y) {
        super(color, x, y);

    }


    @Override
    public boolean isValid(int fromX, int fromY, int toX, int toY) {
        if (super.isValid(fromX, fromY, toX, toY) == false)
            return false;
        for (int i = 1; i < 7; i++) {
            if (fromX == toX && (fromY == toY + i || fromY == toY - i)) {
                System.out.println("X left/right");
                return true;
            } else if (fromY == toY && (fromX == toX + i || fromX == toX - i)) {
                System.out.println("Y top/bottom");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rook";
    }


    @Override
    public String getSymbol() {
        return "♜";
    }
}
