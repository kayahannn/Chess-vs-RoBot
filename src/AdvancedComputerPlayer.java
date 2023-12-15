import java.util.Random;
//Evaluating decisions by Material and Using Famous strategy
public  class AdvancedComputerPlayer extends ComputerPlayer{


    public AdvancedComputerPlayer() {
        this.name = "Bard";

    }

    @Override
    public void makeMove() {
        System.out.println(this.name + " is making a move...");

        makeRandomMove();
    }

    private void makeRandomMove() {
        Random random = new Random();
        int fromX = random.nextInt(8);
        int fromY = random.nextInt(8);
        int toX = random.nextInt(8);
        int toY = random.nextInt(8);


        if (isValidMove(fromX, fromY, toX, toY)) {
            Board.getSpot(toX, toY).occupySpot(Board.getSpot(fromX, fromY).releaseSpot());
        } else {

            makeRandomMove();
        }
    }

    private boolean isValidMove(int fromX, int fromY, int toX, int toY) {

        return true;
    }

}