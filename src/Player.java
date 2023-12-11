import java.util.Scanner;

public abstract class Player {

    Scanner sc = new Scanner(System.in);
    protected String name;
    protected Color color;

    public String getName() {
        return name;
    }

    public Player() {
        this.name = null;
        this.color = null;
    }

    public void makeMove(int fromX, int fromY, int toX, int toY, Board board) {

        // Get the piece from the source spot
        Piece pieceToMove = board.getSpot(fromX, fromY).getPiece();

        // Check if there's a piece at the source spot
        if (pieceToMove != null) {
            // Remove the piece from the source spot
            board.getSpot(fromX, fromY).releaseSpot();

            // Move the piece to the destination spot
            board.getSpot(toX, toY).occupySpot(pieceToMove);
        } else {
            // Handle the case where there's no piece at the source spot
            System.out.println("There is no piece at the source spot.");
        }
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


    public Color getColor() {
        return color;
    }


}

