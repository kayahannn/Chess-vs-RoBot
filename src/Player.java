import java.util.Scanner;

public class Player {
    // color of Pieces
    Color color;
    Scanner sc = new Scanner(System.in);
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

    public void closeScanner() {
        sc.close();
    }
}