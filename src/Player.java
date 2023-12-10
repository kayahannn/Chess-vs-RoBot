import java.util.Scanner;

public class Player {
    Color color;
    Scanner sc = new Scanner(System.in);

    public Player() {
    }
    public void move(int fromX, int fromY,int toX,int toY,Board board){
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
    public Player(Color color) {
    }

//    public void selectColor() {
//        boolean validInput = false;
//        do {
//            System.out.println("Select your color of pieces BLACK/WHITE:");
//            try {
//                color = Color.valueOf(sc.nextLine().toUpperCase());
//                validInput = true;
//            } catch (IllegalArgumentException e) {
//                System.out.println("Invalid color. Please choose a valid color.");
//            }
//        } while (!validInput);
//    }

    public void closeScanner() {
        sc.close();
    }


    public Color getColor() {
        return color;
    }
}

