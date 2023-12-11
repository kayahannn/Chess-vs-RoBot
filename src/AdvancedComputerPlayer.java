import java.util.Random;
//Evaluating decisions by Material and Using Famous strategy
public  class AdvancedComputerPlayer extends ComputerPlayer{

    public AdvancedComputerPlayer() {
        this.name = "Google";
    }


    @Override
    public void makeMove(Board board) {
        System.out.println("Advanced computer is making a move...");


        makeRandomMove(board);
    }

    private void makeRandomMove(Board board) {
        Random random = new Random();
        int fromX = random.nextInt(8);
        int fromY = random.nextInt(8);
        int toX = random.nextInt(8);
        int toY = random.nextInt(8);


        if (isValidMove(board, fromX, fromY, toX, toY)) {
            board.getSpot(toX, toY).occupySpot(board.getSpot(fromX, fromY).releaseSpot());
        } else {

            makeRandomMove(board);
        }
    }

    private boolean isValidMove(Board board, int fromX, int fromY, int toX, int toY) {

        return true;
    }
}