import java.util.Scanner;

public class HumanPlayer extends Player {

    final Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
//        this.color = null;
        this.setName("User");
    }

    public void selectColor() {
        boolean validInput = false;
        do {
            System.out.println("Select your color of pieces BLACK/WHITE:");
            try {
                setColor(Color.valueOf(sc.nextLine().toUpperCase()));
//                color = Color.valueOf(sc.nextLine().toUpperCase());
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid color. Please choose a valid color.");
            }
        } while (!validInput);

    }

    public void makeMove(Board board, int fromX, int fromY, int toX, int toY) {

        Spot sourceSpot = Board.getSpot(fromX, fromY);
        Spot destinationSpot = Board.getSpot(toX, toY);
        Piece pieceToMove = sourceSpot.getPiece();

        if (pieceToMove == null) {
            System.out.println("There is no piece to move");
            askForCoordinates(board);
        } else if (!pieceToMove.getColor().equals(this.getColor())) {
            System.out.println("You are trying to move the wrong colored piece");
            askForCoordinates(board);
        } else if (destinationSpot.getPiece() != null && pieceToMove.getColor() == destinationSpot.getPiece().getColor()) {
            System.out.println("You are trying to move onto your own piece");
            askForCoordinates(board);
        } else if (!pieceToMove.isValid(board, fromX, fromY, toX, toY)) {
            System.out.println("wrong direction of Piece");
            askForCoordinates(board);
        } else {
            sourceSpot.releaseSpot();
            destinationSpot.occupySpot(pieceToMove);
        }
    }

    @Override
    public void makeMove(Board board) {
        throw new UnsupportedOperationException("Method not supported");
    }

    public void askForCoordinates(Board board) {
        Coordinates moveFromSpot = Coordinates.humanPlayerEnterCoordinates();
        Coordinates moveToSpot = Coordinates.humanPlayerEnterCoordinates();
        makeMove(board, moveFromSpot.getRank() - 1, moveFromSpot.getIntFile(), moveToSpot.getRank() - 1, moveToSpot.getIntFile());

    }
}
