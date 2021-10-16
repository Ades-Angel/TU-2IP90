import java.util.stream.IntStream;

/*
Chloe Antonozzi
1670980

16/10/2021
*/

class Rational {
    int numerator;
    int denominator;

    Rational(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    int getNumerator() {
        return this.numerator;
    }

    int getDenominator() {
        return this.numerator;
    }

    String toStr() {
        return String.format("%d/%d", getNumerator(), getDenominator());
    }

    void simplify() {
        // Insert code here
    }

    boolean eq(Rational other) {
        if ((this.subtract((Rational) (other))).getNumerator() == 0) {
            return true;
        } else {
            return false;
        }
    }

    int compareTo(Rational other) {
        if (this.subtract(other).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(other).getNumerator() == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    int gcd(final int a, final int b) {
        if (b > a) {
            return gcd(b, a);
        }
        return IntStream.rangeClosed(1, a).filter(n -> (a % n) == 0).filter(n -> (b % n) == 0).max().orElse(1);
    }

    Rational multiply(Rational other) {
        final Rational product = new Rational(this.numerator * other.numerator, this.denominator * other.denominator);

        return product;
    }

    Rational add(Rational other) {
        final Rational sum = new Rational((this.numerator * other.denominator) + (other.numerator * this.denominator),
                this.denominator * other.denominator);

        return sum;
    }

    Rational subtract(Rational other) {
        final Rational diff = new Rational((this.numerator * other.denominator) - (other.numerator * this.denominator),
                this.denominator * other.denominator);

        return diff;
    }

    Rational divide(Rational other) {
        final Rational product = new Rational(this.numerator * other.denominator, this.denominator * other.numerator);

        return product;
    }
}
