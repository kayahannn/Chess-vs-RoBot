import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PawnDiffblueTest {
    /**
     * Method under test: {@link Pawn#isValid(int, int, int, int)}
     */
    @Test
    void testIsValid() {
        assertFalse((new Pawn(Color.WHITE, 2, 3)).isValid(1, 1, 1, 1));
        assertFalse((new Pawn(Color.WHITE, 2, 3)).isValid(0, 1, 1, 1));
        assertFalse((new Pawn(Color.WHITE, 2, 3)).isValid(-1, 1, 1, 1));
        assertTrue((new Pawn(Color.WHITE, 2, 3)).isValid(1, 0, 1, 1));
        assertFalse((new Pawn(Color.WHITE, 2, 3)).isValid(1, -1, 1, 1));
        assertFalse((new Pawn(Color.WHITE, 2, 3)).isValid(1, 1, -1, 1));
        assertFalse((new Pawn(Color.WHITE, 2, 3)).isValid(1, 1, 1, -1));
    }
}
