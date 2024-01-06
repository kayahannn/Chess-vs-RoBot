import java.util.Scanner;

public class Coordinates {
    public static final Scanner sc = new Scanner(System.in);
    private final File file;
    private final int rank;

    public Coordinates(File file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public int getIntFile() {
        return file.ordinal();
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "file=" + file.ordinal() +
                ", rank=" + rank +
                '}';
    }

    public static Coordinates humanPlayerEnterCoordinates() {
        while (true) {
            System.out.println("Please enter coordinates (Example: a1 )");

            String line = sc.nextLine();

            if (line.length() != 2) {
                System.out.println("Invalid format, expect 2 digits");
                continue;
            }

            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if (!Character.isLetter(fileChar) || !Character.isDigit(rankChar)) {
                System.out.println("Invalid format, expect Flie and Number");
                continue;
            }

            int rank = Character.getNumericValue(rankChar);
            if (rank < 1 || rank > 8) {
                System.out.println("Invalid format, Number value between 1 - 8");
                continue;
            }

            File file = File.fromChar(fileChar);
            if (file == null) {
                System.out.println("Invalid format, File value between A - H");
                continue;
            }

            return new Coordinates(file, rank);
        }
    }
}
