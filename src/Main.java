import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player humanPlayer = new Player();
        humanPlayer.selectColor();

        System.out.println("Select computer difficulty level: (1) Beginner or (2) Advanced");
        int computerLevelChoice = scanner.nextInt();


        ComputerPlayer computer1 = null;
        ComputerPlayer computer2 = null;

        if (computerLevelChoice == 1) {
            computer1 = new BeginnerComputerPlayer();
        } else {
            computer2 = new AdvancedComputerPlayer();
        }

        Board chessBoard = new Board();

        // Include computer players in the array
        Player[] players;
        if (computer1 != null && computer2 != null) {
            players = new Player[]{humanPlayer, computer1, computer2};
        } else if (computer1 != null) {
            players = new Player[]{humanPlayer, computer1};
        } else if (computer2 != null) {
            players = new Player[]{humanPlayer, computer2};
        } else {
            players = new Player[]{humanPlayer};
        }

        displayBoard(chessBoard);

        while (true) {
            for (Player player : players) {
                playTurn(player, chessBoard);
                displayBoard(chessBoard);

                // Check for checkmate or stalemate
                if (isCheckmateOrStalemate(player, chessBoard)) {
                    System.out.println("Game over. " + getOpponent(player).getColor() + " wins!");
                    scanner.close();
                    return;
                }
            }
        }
    }

    private static void playTurn(Player player, Board board) {
        System.out.println(player.getColor() + "'s turn");
        if (player instanceof ComputerPlayer) {
            ((ComputerPlayer) player).makeMove(board);
        } else {

            board.getSpot(4, 1).occupySpot(board.getSpot(2, 1).releaseSpot());
        }
    }

    private static void displayBoard(Board board) {

        System.out.println("Current Board State:");
    }

    private static boolean isCheckmateOrStalemate(Player player, Board board) {

        return false;
    }

    private static Player getOpponent(Player currentPlayer) {
        return currentPlayer.getColor() == Color.WHITE ? new Player(Color.BLACK) : new Player(Color.WHITE);
    }
}
