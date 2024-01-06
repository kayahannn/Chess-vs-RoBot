public class Queen extends Piece {

    public Queen(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (!super.isValid(board, fromX, fromY, toX, toY) || (LongRangePieceCheck.isPathOccupied(board, fromX, fromY, toX, toY)))
            return false;
        for (int i = 1; i <= 7; i++) {
            if (fromX == toX && (fromY == toY + i || fromY == toY - i)) {
//                System.out.println("X left/right");
                return true;
            } else if (fromY == toY && (fromX == toX + i || fromX == toX - i)) {
//                System.out.println("Y top/bottom");
                return true;
            } else if (fromX + i == toX && fromY + i == toY) {
//                System.out.println("top right");
                return true;
            } else if (fromX + i == toX && fromY - i == toY) {
//                System.out.println("top left");
                return true;

            } else if (fromX - i == toX && fromY - i == toY) {
//                System.out.println("bottom left");
                return true;

            } else if (fromX - i == toX && fromY + i == toY) {
//                System.out.println("bottom right");
                return true;

            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Queen";
    }

    @Override
    public String getSymbol() {
        return "♛";
    }

}
