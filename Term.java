public class Term {

    protected int coeff;
    protected int exp;

    Term(int c, int e) {
        coeff = c;
        exp = e;
    }

    public boolean isGreater(Term t) {
        // Check if the current term's exponent is greater than the other term's exponent
        if (this.exp > t.getExp()) {
            return true;
        } else if (this.exp == t.getExp() && this.coeff > t.getCoeff()) {
            // If exponents are equal, compare coefficients
            return true;
        } else {
            return false;
        }
    }

    public int evaluate(int x) {
        // Evaluate the term for a given value of x
        return (int) (coeff * Math.pow(x, exp));
    }

    public String toString() {
        // Return a string representation of the term
        if (exp == 0) {
            return String.valueOf(coeff);
        } else if (coeff == 1) {
            return exp;
        } else {
            return coeff + "x^" + exp;
        }
    }

    public int getCoeff() {
        // Return the coefficient of the term
        return coeff;
    }

    public int getExp() {
        // Return the exponent of the term
        return exp;
    }
}
