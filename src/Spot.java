public class Spot {
    protected int x;
    protected int y;
    private Piece piece;

    public Spot(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void occupySpot(Piece piece) {

        this.piece = piece;
    }

    public boolean isOccupied() {
        if (piece != null)
            return true;
        return false;
    }

    public Piece releaseSpot() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

    @Override
    public String toString() {
        return piece.toString();
    }
}
