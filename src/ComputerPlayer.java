

public abstract class ComputerPlayer extends Player {

    public ComputerPlayer(Color color) {
        super(color);
    }

    public ComputerPlayer() {
        super();
    }


    public abstract void makeMove(Board board);

    }


