import java.util.Scanner;

public class Coordinates {
    public static final Scanner sc = new Scanner(System.in);
    private final File file;
    private final int rank;

    public Coordinates(File file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public File getFile() {
        return file;
    }
    public int  getIntFile() {
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
            System.out.println("Please enter coordinates (ex. a1)");

            String line = sc.nextLine();

            if (line.length() != 2) {
                System.out.println("Invalid format");
                continue;
            }

            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if (!Character.isLetter(fileChar) || !Character.isDigit(rankChar)) {
                System.out.println("Invalid format");
                continue;
            }

            int rank = Character.getNumericValue(rankChar);
            if (rank < 1 || rank > 8) {
                System.out.println("Invalid format");
                continue;
            }

            File file = File.fromChar(fileChar);
            if (file == null) {
                System.out.println("Invalid format");
                continue;
            }

            return new Coordinates(file, rank);
        }
    }
}
