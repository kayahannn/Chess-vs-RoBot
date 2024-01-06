import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.selectColor();

        System.out.println("Select computer difficulty level: (1) Beginner -Chat- or (2) Advanced -Bard-");
        try {

            int computerLevelChoice = scanner.nextInt();
            ComputerPlayer computer1 = null;
            ComputerPlayer computer2 = null;

            Player[] players;

            if (computerLevelChoice == 1) {
                computer1 = new BeginnerComputerPlayer();
                computer1.setColor(Color.oppositeColor(humanPlayer));

                players = new Player[]{humanPlayer, computer1};
            } else if (computerLevelChoice == 2) {
                computer2 = new AdvancedComputerPlayer();
                computer2.setColor(Color.oppositeColor(humanPlayer));

                players = new Player[]{humanPlayer, computer2};
            } else {
                scanner.close();
                throw new Exception("Invalid difficulty Level!");
            }


            Board chessBoard = new Board();
            chessBoard.initializeStartingBoard();
            chessBoard.displayBoard();

            while (true) {
                for (Player player : players) {
                    player.playTurn(chessBoard);
                    if (isCheckmateOrStalemate(player, chessBoard)) {
                        System.out.println("Game over. " + player.getName() + " wins!");
                        scanner.close();
                        return;
                    }
                }
                chessBoard.displayBoard();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    private static boolean isCheckmateOrStalemate(Player player, Board board) {
        //TODO implement method
        return false;
    }

}
