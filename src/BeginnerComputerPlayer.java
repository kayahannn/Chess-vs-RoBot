import java.util.Random;

//Evaluating game by Material, taken pieces
public class BeginnerComputerPlayer extends ComputerPlayer {


    public BeginnerComputerPlayer() {
        this.name = "Chat GPT";
    }

    @Override
    public void makeMove(Board board) {
        System.out.println(this.name + " is making a move...");


        Random random = new Random();
        int fromX = random.nextInt(8);
        int fromY = random.nextInt(8);
        int toX = random.nextInt(8);
        int toY = random.nextInt(8);


        if (isValidMove(board, fromX, fromY, toX, toY)) {
            Piece pieceToMove = board.getSpot(fromX, fromY).getPiece();
            if (pieceToMove != null) {
                board.getSpot(fromX, fromY).releaseSpot();
                board.getSpot(toX, toY).occupySpot(pieceToMove);
            } else {
                System.out.println("There is no piece at the source spot.");
            }
        }
    }

    private boolean isValidMove(Board board, int fromX, int fromY, int toX, int toY) {

        return true;
    }

    @Override
    public void selectColor() {

    }
}

