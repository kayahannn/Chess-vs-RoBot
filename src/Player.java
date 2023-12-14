public abstract class Player {
    protected String name;
    protected Color color;

    public String getName() {
        return name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void makeMove(int fromX, int fromY, int toX, int toY, Board board) {

        Piece pieceToMove = board.getSpot(fromX, fromY).getPiece();
        if (pieceToMove != null) {
            board.getSpot(fromX, fromY).releaseSpot();
            board.getSpot(toX, toY).occupySpot(pieceToMove);

        } else {
            System.out.println("There is no piece at the source spot.");
        }
    }

    public abstract void selectColor();


    public Color getColor() {
        return color;
    }


}

