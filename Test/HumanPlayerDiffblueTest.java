import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HumanPlayerDiffblueTest {
    /**
     * Method under test: {@link HumanPlayer#isValidMove(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsValidMove() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Spot.getPiece()" because "sourceSpot" is null
        //       at HumanPlayer.isValidMove(HumanPlayer.java:31)
        //   See https://diff.blue/R013 to resolve this issue.

        (new HumanPlayer()).isValidMove(1, 1, 1, 1);
    }

    /**
     * Method under test: {@link HumanPlayer#isValidMove(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsValidMove2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 8
        //       at Board.getSpot(Board.java:19)
        //       at HumanPlayer.isValidMove(HumanPlayer.java:28)
        //   See https://diff.blue/R013 to resolve this issue.

        (new HumanPlayer()).isValidMove(-1, 1, 1, 1);
    }

    /**
     * Method under test: {@link HumanPlayer#isValidMove(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsValidMove3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 8
        //       at Board.getSpot(Board.java:19)
        //       at HumanPlayer.isValidMove(HumanPlayer.java:28)
        //   See https://diff.blue/R013 to resolve this issue.

        (new HumanPlayer()).isValidMove(1, -1, 1, 1);
    }

    /**
     * Method under test: {@link HumanPlayer#isValidMove(int, int, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsValidMove4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 8
        //       at Board.getSpot(Board.java:19)
        //       at HumanPlayer.isValidMove(HumanPlayer.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        (new HumanPlayer()).isValidMove(1, 1, -1, 1);
    }
}
