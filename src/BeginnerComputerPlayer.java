import java.util.Random;

//Evaluating game by Material, taken pieces
public class BeginnerComputerPlayer extends ComputerPlayer {


    public BeginnerComputerPlayer() {
        this.name = "Chat GPT";
    }

    @Override
    public void makeMove() {
        System.out.println(this.name + " is making a move...");
        boolean validMove = false;

        while (!validMove) {
            Random random = new Random();
            int fromX = random.nextInt(8);
            int fromY = random.nextInt(8);
            int toX = random.nextInt(8);
            int toY = random.nextInt(8);


            if (isValidMove(fromX, fromY, toX, toY)) {

                Spot sourceSpot = Board.getSpot(fromX, fromY);
                Spot destinationSpot = Board.getSpot(toX, toY);
                Piece pieceToMove = sourceSpot.getPiece();
                if (pieceToMove != null && pieceToMove.getColor().equals(this.color)) {
                    sourceSpot.releaseSpot();
                    destinationSpot.occupySpot(pieceToMove);
                    validMove = true;
                } else {
                    System.out.println("There is no piece at the source spot.");
                }
            }
        }
    }

    private boolean isValidMove(int fromX, int fromY, int toX, int toY) {

        return true;
    }

}

