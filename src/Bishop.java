public class Bishop extends Piece {


    public Bishop(Color color, int x, int y) {
        super(color, x, y);

    }

    @Override
    public boolean isValid(int fromX, int fromY, int toX, int toY) {
        if (super.isValid(fromX, fromY, toX, toY) == false)
            return false;
        for (int i = 1; i <= 7; i++) {
            if (fromX + i == toX && fromY + i == toY) {
                System.out.println("top right");
                return true;
            } else if (fromX + i == toX && fromY - i == toY) {
                System.out.println("top left");
                return true;

            } else if (fromX - i == toX && fromY - i == toY) {
                System.out.println("bottom left");
                return true;

            } else if (fromX - i == toX && fromY + i == toY) {
                System.out.println("bottom right");
                return true;

            }
        }


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
