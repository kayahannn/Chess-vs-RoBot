public abstract class Player {
    protected String name;
    protected Color color;

    public String getName() {
        return name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void makeMove();
}

