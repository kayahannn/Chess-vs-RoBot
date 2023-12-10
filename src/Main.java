import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player humanPlayer = new HumanPlayer();
//        humanPlayer.selectColor();

        System.out.println("Select computer difficulty level: (1) Beginner or (2) Advanced");
        int computerLevelChoice = scanner.nextInt();


        ComputerPlayer computer1 = null;
        ComputerPlayer computer2 = null;

        if (computerLevelChoice == 1) {
            computer1 = new BeginnerComputerPlayer();
        } else {
            computer2 = new AdvancedComputerPlayer();
        }

        // Include computer players in the array
        Player[] players;
        if (computer1 != null) {
            players = new Player[]{humanPlayer, computer1};
        } else {
            players = new Player[]{humanPlayer, computer2};
        }

        Board chessBoard = new Board();
        chessBoard.initializeStartingBoard();
        chessBoard.displayBoard();

        while (true) {
            for (Player player : players) {
                playTurn(player, chessBoard);
                chessBoard.displayBoard();

                // Check for checkmate or stalemate
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

        System.out.println(player.name + "'s turn");

        if (player instanceof ComputerPlayer) {
            ((ComputerPlayer) player).makeMove(board);
        } else {
            System.out.println("Enter coordinates from move: ");
            String line = input.nextLine();
            int fromX = Character.getNumericValue(line.charAt(0));
            int fromY = Character.getNumericValue(line.charAt(1));
            System.out.println("Enter coordinates to move: ");
            line = input.nextLine();
            int toX = Character.getNumericValue(line.charAt(0));
            int toY = Character.getNumericValue(line.charAt(1));
            player.makeMove(fromX, fromY, toX, toY, board);

        }
    }


    private static boolean isCheckmateOrStalemate(Player player, Board board) {

        return false;
    }

}
