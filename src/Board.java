public class Board {
    private static final Spot[][] spots = new Spot[8][8];
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";


    public Board() {
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots.length; j++) {
                spots[i][j] = new Spot(i, j, null);
            }
        }
    }


    public Spot getSpot(int x, int y) {
        return spots[x][y];
    }


    protected void displayBoard() {

        System.out.println("      a    b    c    d    e    f    g    h");
        System.out.println("   -----------------------------------------");

        for (int i = 7; i >= 0; i--) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 8; j++) {
                if (getSpot(i, j).getPiece() == null) {
                    System.out.print(" " + "  " + " |");
                } else {
                    if (getSpot(i, j).getPiece().getColor().equals(Color.BLACK)) {
                        System.out.print(" " + getSpot(i, j).getPiece().getSymbol() + " | ");
                    } else {
                        System.out.print(" " + ANSI_BLACK + getSpot(i, j).getPiece().getSymbol() + ANSI_RESET + " | ");

                    }
                }
            }
            System.out.print(" " + (i + 1));
            System.out.println("\n   -----------------------------------------");
        }

        System.out.println("      a    b    c    d    e    f    g    h");
        System.out.println();
    }

    public void initializeStartingBoard() {

        //Pawn
        for (int i = 0; i <= 7; i++) {
            spots[1][i] = new Spot(1, i, new Pawn(Color.BLACK, 1, i));
            spots[6][i] = new Spot(6, i, new Pawn(Color.WHITE, 6, i));
        }

        //Knights
        spots[0][1] = new Spot(0, 1, new Knight(Color.BLACK, 0, 1));
        spots[0][6] = new Spot(0, 1, new Knight(Color.BLACK, 0, 6));
        spots[7][1] = new Spot(0, 6, new Knight(Color.WHITE, 7, 1));
        spots[7][6] = new Spot(0, 6, new Knight(Color.WHITE, 7, 6));

        //Rooks
        spots[0][0] = new Spot(0, 0, new Rook(Color.BLACK, 0, 0));
        spots[0][7] = new Spot(0, 7, new Rook(Color.BLACK, 0, 7));
        spots[7][0] = new Spot(7, 0, new Rook(Color.WHITE, 7, 0));
        spots[7][7] = new Spot(7, 7, new Rook(Color.WHITE, 7, 7));

        //Bishop
        spots[0][2] = new Spot(0, 3, new Bishop(Color.BLACK, 0, 2));
        spots[0][5] = new Spot(0, 5, new Bishop(Color.BLACK, 0, 5));
        spots[7][2] = new Spot(7, 3, new Bishop(Color.WHITE, 7, 2));
        spots[7][5] = new Spot(7, 5, new Bishop(Color.WHITE, 7, 5));

        //King
        spots[0][4] = new Spot(7, 5, new King(Color.BLACK, 0, 4));
        spots[7][4] = new Spot(7, 5, new King(Color.WHITE, 7, 4));


        //Queen
        spots[0][3] = new Spot(0, 3, new Queen(Color.BLACK, 0, 3));
        spots[7][3] = new Spot(7, 3, new Queen(Color.WHITE, 7, 3));


    }

}
