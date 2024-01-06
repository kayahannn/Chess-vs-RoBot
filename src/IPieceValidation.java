public interface IPieceValidation {
    public interface FigureValidation {
        boolean isValid(Board board, int fromX, int fromY, int toX, int toY);
    }
}
