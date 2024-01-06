public class LongRangePieceCheck {

    public static boolean isPathOccupied(Board board, int fromX, int fromY, int toX, int toY) {
        int directionX = (toX - fromX) != 0 ? (toX - fromX) / Math.abs(toX - fromX) : 0;
        int directionY = (toY - fromY) != 0 ? (toY - fromY) / Math.abs(toY - fromY) : 0;

        int xPath = fromX + directionX;
        int yPath = fromY + directionY;

        while (xPath != toX || yPath != toY) {
            if (yPath >= 7 || xPath >= 7 || yPath < 0 || xPath < 0) {
                return false;
            }

            Piece piece = board.getSpot(xPath, yPath).getPiece();
            if (piece != null) {
                return true;
            }

            xPath += directionX;
            yPath += directionY;
        }

        return false;
    }

}
