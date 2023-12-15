import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
        this.color = null;
        this.name = "User";
    }

    public void selectColor() {
        boolean validInput = false;
        do {
            System.out.println("Select your color of pieces BLACK/WHITE:");
            try {
                color = Color.valueOf(sc.nextLine().toUpperCase());
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid color. Please choose a valid color.");
            }
        } while (!validInput);

    }

    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {

        return true;
    }


    public void makeMove(int fromX, int fromY, int toX, int toY) {

        Spot sourceSpot = Board.getSpot(fromX, fromY);
        Spot destinationSpot = Board.getSpot(toX, toY);

        Piece pieceToMove = sourceSpot.getPiece();

        if (pieceToMove == null) {
            System.out.println("There is no piece to move");
        } else if (!pieceToMove.getColor().equals(this.color)) {
            System.out.println("You are trying to move the wrong colored piece");
        } else if (destinationSpot.getPiece() != null && pieceToMove.getColor() == destinationSpot.getPiece().getColor()) {
            System.out.println("You are trying to move onto your own piece");
        } else {
            sourceSpot.releaseSpot();
            destinationSpot.occupySpot(pieceToMove);
        }
    }

    @Override
    public void makeMove() {

    }
}
