import org.junit.Test;
import static org.junit.Assert.*;

public class TermTest {

    @Test
    public void testIsGreater() {
        Term term1 = new Term(3, 2);
        Term term2 = new Term(2, 3);
        // term1 is not greater than term2 because exp of term2 is higher
        assertFalse(term1.isGreater(term2));
    }

    @Test
    public void testEvaluate() {
        Term term = new Term(3, 2);
        int x = 2;
        // Evaluates to 3 * (2^2) = 3 * 4 = 12
        assertEquals(12, term.evaluate(x));
    }

    @Test
    public void testToString() {
        Term term = new Term(3, 2);
        // Should return "3x^2"
        assertEquals("3x^2", term.toString());
    }

    @Test
    public void testGetCoeff() {
        Term term = new Term(3, 2);
        // Coefficient should be 3
        assertEquals(3, term.getCoeff());
    }

    @Test
    public void testGetExp() {
        Term term = new Term(3, 2);
        // Exponent should be 2
        assertEquals(2, term.getExp());
    }
}
