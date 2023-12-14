import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
        this.color = null;
        this.name = "User";
    }

    @Override
    public void selectColor() {
        boolean validInput = false;
        do {
            System.out.println("Select your color of pieces BLACK/WHITE:");
            try {
                color = Color.valueOf(sc.nextLine().toUpperCase());
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid color. Please choose a valid color.");
            }
        } while (!validInput);

    }

}
