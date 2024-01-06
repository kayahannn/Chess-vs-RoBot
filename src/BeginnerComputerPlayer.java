import java.util.Random;

//Evaluating game by Material, taken pieces
public class BeginnerComputerPlayer extends ComputerPlayer {

    private final Random random = new Random();

    public BeginnerComputerPlayer() {
        this.setName("Chat GPT");
    }

    @Override
    public void makeMove(Board board) {
        System.out.println(this.getName() + " is making a move...");
        boolean validMove = false;

        while (!validMove) {

            int fromX = random.nextInt(7);
            int fromY = random.nextInt(7);
            int toX = random.nextInt(7);
            int toY = random.nextInt(7);

            Spot sourceSpot = Board.getSpot(fromX, fromY);
            Spot destinationSpot = Board.getSpot(toX, toY);

            Piece pieceToMove = sourceSpot.getPiece();

            if ((pieceToMove != null &&
                    pieceToMove.getColor().equals(this.getColor()) &&
                    pieceToMove.isValid(board, fromX, fromY, toX, toY))) {
                sourceSpot.releaseSpot();
                destinationSpot.occupySpot(pieceToMove);
                validMove = true;
            }
//            else {
//              System.out.println("The move is invalid");
//            }
        }
    }
}


