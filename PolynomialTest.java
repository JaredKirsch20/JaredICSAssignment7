import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolynomialTest {

    private Polynomial polynomial;
    private Term constantTerm;
    private Term linearTerm;
    private Term quadraticTerm;

    @Before
    public void setUp() {
        // Initialize some terms to use in the tests
        constantTerm = new Term(3, 0); // Represents the term 3
        linearTerm = new Term(2, 1);   // Represents the term 2x
        quadraticTerm = new Term(1, 2); // Represents the term x^2

        // Create a polynomial with these terms
        polynomial = new Polynomial(new Term[]{quadraticTerm, linearTerm, constantTerm});
    }

    @Test
    public void testevaluate() {
        // Test the evaluate method at x = 2
        int expectedValue = 11; // 2^2 + 2*2 + 3
        assertEquals(expectedValue, polynomial.evaluate(2));
    }

    @Test
    public void testsortPoly() {
        // Test the sortPoly method to ensure the highest order term is first
        polynomial.sortPoly();
        assertEquals(quadraticTerm, polynomial.terms.get(0));
    }

    @Test
    public void testtoString() {
        // Test the toString method
        String expectedString = "x^2 + 2x + 3";
        polynomial.sortPoly(); // Ensure the polynomial is sorted before converting to string
        assertEquals(expectedString, polynomial.toString());
    }

    @Test
    public void testgetOrder() {
        // Test the getOrder method
        int expectedOrder = 2; // The order of x^2
        assertEquals(expectedOrder, polynomial.getOrder());
    }

    @Test
    public void testaddTerm() {
        // Test the addTerm method
        Term newTerm = new Term(4, 3); // Represents the term 4x^3
        polynomial.addTerm(newTerm);
        assertTrue(polynomial.terms.contains(newTerm));
    }
}
