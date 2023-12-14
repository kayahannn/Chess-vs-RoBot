import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player humanPlayer = new HumanPlayer();
        humanPlayer.selectColor();

        System.out.println("Select computer difficulty level: (1) Beginner -Chat- or (2) Advanced -Bard-");
        int computerLevelChoice = scanner.nextInt();


        ComputerPlayer computer1 = null;
        ComputerPlayer computer2 = null;
        Player[] players;
        if (computerLevelChoice == 1) {
            computer1 = new BeginnerComputerPlayer();
            computer1.setColor(Color.oppositeColor(humanPlayer));
            players = new Player[]{humanPlayer, computer1};
        } else {
            computer2 = new AdvancedComputerPlayer();
            computer2.setColor(Color.oppositeColor(humanPlayer));
            players = new Player[]{humanPlayer, computer2};

        }

        Board chessBoard = new Board();
        chessBoard.initializeStartingBoard();
        chessBoard.displayBoard();

        while (true) {
            for (Player player : players) {
                playTurn(player, chessBoard);
                chessBoard.displayBoard();

                if (isCheckmateOrStalemate(player, chessBoard)) {
                    System.out.println("Game over. " + player.name + " wins!");
                    scanner.close();
                    return;
                }
            }
        }
    }

    public static void playTurn(Player player, Board board) {
        Scanner input = new Scanner(System.in);

        System.out.println(player.getName() + "'s turn" + " playing with " + player.getColor());

        if (player instanceof ComputerPlayer) {
            ((ComputerPlayer) player).makeMove(board);
        } else {
            System.out.println("Move from Spot: ");
            Coordinates moveFromSpot = Coordinates.humanPlayerEnterCoordinates();
            System.out.println(moveFromSpot.toString());
            System.out.println("Move to Spot: ");
            Coordinates moveToSpot = Coordinates.humanPlayerEnterCoordinates();
            System.out.println(moveToSpot);
            player.makeMove(moveFromSpot.getRank() - 1, moveFromSpot.getIntFile(), moveToSpot.getRank() - 1, moveToSpot.getIntFile(), board);

        }
    }


    private static boolean isCheckmateOrStalemate(Player player, Board board) {

        return false;
    }

}
