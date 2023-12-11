import java.util.Random;
//Evaluating game by Material, taken pieces
public class BeginnerComputerPlayer extends ComputerPlayer {

    public BeginnerComputerPlayer() {
        this.name = "Chat";
    }


    @Override
    public void makeMove(Board board) {
        System.out.println("Beginner computer is making a move...");


        Random random = new Random();
        int fromX = random.nextInt(8);
        int fromY = random.nextInt(8);
        int toX = random.nextInt(8);
        int toY = random.nextInt(8);


//        if (isValidMove(board, fromX, fromY, toX, toY)) {
//            board.getSpot(toX, toY).occupySpot(board.getSpot(fromX, fromY).releaseSpot());
//
//        } else {
//            makeMove(fromX, fromY, toX, toY, board);
//
//            makeMove(board);
//        }

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

    private boolean isValidMove(Board board, int fromX, int fromY, int toX, int toY) {

        return true;
    }
}

