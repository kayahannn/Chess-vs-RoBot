public class King extends Piece {


    public King(Color color, int x, int y) {
        super(color, x, y);

    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        for (int i = 1; i <= 1; i++) {
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
        return "King";
    }

    @Override
    public String getSymbol() {
        return "♚";
    }

}
