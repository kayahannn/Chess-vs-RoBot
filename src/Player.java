public abstract class Player implements IPlayerMakeMove{
    private String name;
    private Color color;

    public String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

//    public abstract void makeMove(Board board);

    public void playTurn(Board board) {
        System.out.println(this.getName() + "'s turn" + " playing with " + this.getColor());

        if (this instanceof ComputerPlayer) {
            this.makeMove(board);

        } else if (this instanceof HumanPlayer) {
            ((HumanPlayer) this).askForCoordinates(board);
//            System.out.println("Move to Spot: ");
//            System.out.println(moveToSpot);
        }
    }
}

