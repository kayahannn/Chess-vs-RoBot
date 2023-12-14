public enum Color {
    WHITE,
    BLACK;

    public static Color oppositeColor(Player player){
        if(player.getColor().equals(Color.WHITE))
            return Color.BLACK;
        else return Color.WHITE;
    }

}
