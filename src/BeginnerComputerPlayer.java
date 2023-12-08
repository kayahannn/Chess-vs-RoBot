import java.util.Random;

public class BeginnerComputerPlayer extends ComputerPlayer {

    @Override
    public void makeMove(Board board) {
        System.out.println("Beginner computer is making a move...");


        Random random = new Random();
        int fromX = random.nextInt(8);
        int fromY = random.nextInt(8);
        int toX = random.nextInt(8);
        int toY = random.nextInt(8);


        if (isValidMove(board, fromX, fromY, toX, toY)) {
            board.getSpot(toX, toY).occupySpot(board.getSpot(fromX, fromY).releaseSpot());
        } else {

            makeMove(board);
        }
    }

    private boolean isValidMove(Board board, int fromX, int fromY, int toX, int toY) {

        return true;
    }
}

