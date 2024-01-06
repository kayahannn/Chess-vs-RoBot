public abstract class Piece implements IPieceValidation {
    private Color color;
    private int x;
    private int y;

    public Piece(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (toX == fromX && toY == fromY)
            return false;
        return (toX >= 0 && toX <= 7 && fromX >= 0 && fromX <= 7 && toY >= 0 && toY <= 7 && fromY >= 0 && fromY <= 7);
//              &&  (!isPathOccupied(board, fromX, fromY, toX, toY)));
    }

    public abstract String toString();

    public abstract String getSymbol();

    protected Object getColor() {
        return this.color;
    }

//    private boolean isPathOccupied(Board board, int fromX, int fromY, int toX, int toY) {
//        int directionX = (toX - fromX) != 0 ? (toX - fromX) / Math.abs(toX - fromX) : 0;
//        int directionY = (toY - fromY) != 0 ? (toY - fromY) / Math.abs(toY - fromY) : 0;
//
//        int xPath = Math.abs(fromX + directionX);
//        int yPath = Math.abs(fromY + directionY);
//
//        while (xPath != toX || yPath != toY) {
//            if (yPath > 7 || xPath > 7 || yPath < 0 || xPath < 0) {
//                return false;
//            }
//
//            Piece piece = board.getSpot(xPath, yPath).getPiece();
//            if (piece != null) {
//                return true;
//            }
//
//            xPath += directionX;
//            yPath += directionY;
//        }
//
//        return false;
//    }
}