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

//            int fromX = 1;
//            int fromY = 0;
//            int toX = 2;
//            int toY = 0;

            Spot sourceSpot = Board.getSpot(fromX, fromY);
            Spot destinationSpot = Board.getSpot(toX, toY);

            Piece pieceToMove = sourceSpot.getPiece();

            if ((pieceToMove != null && // проверка за налична фигура
                    pieceToMove.getColor().equals(this.getColor()) && // проверка за преместване на правилна фигура по цвят
                    pieceToMove.isValid(board, fromX, fromY, toX, toY)) && //проверка за двиежение на фигурата
//                    (destinationSpot.getPiece() != null && pieceToMove.getColor() != destinationSpot.getPiece().getColor()))  { // трябва да се добваи проверка за премесвтване върху собственна фигурас
                    ( destinationSpot.getPiece() == null
                    || pieceToMove.getColor() != destinationSpot.getPiece().getColor())) {
                sourceSpot.releaseSpot();// освобождаване на позицията от фигура
                destinationSpot.occupySpot(pieceToMove); //преместване на фигура в избраната позиция
                validMove = true;
            }
//            else {
//              System.out.println("The move is invalid");
//            }
        }
    }
}


