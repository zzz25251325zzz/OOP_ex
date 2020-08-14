package Week3.Task2;

import Week3.Task1.Week3Task1;

public class Fraction {
        private int denominator;
        private int numerator = 1;

        public Fraction(int denominator, int numerator ){
            if (numerator == 0) {
                System.out.println("Err in numerator: need > 0");
            } else {
                this.denominator = denominator;
                this.numerator = numerator;
            }
        }

        public Fraction() {
            System.out.println("Need n and d");
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public Fraction reduce(int denominator, int numerator) {
            if (numerator == 0) {
                return null ;
            } else {
                Week3Task1 week3Task1 = new Week3Task1();
                int ucln = week3Task1.gcd(denominator, numerator);
                int d = denominator/ucln;
                int n = numerator/ucln;

                System.out.println(d + "/" + n);
                return new Fraction(d, n);
            }
        }

        public Fraction add(Fraction fraction) {
            int d = (this.numerator*fraction.denominator + this.denominator*fraction.numerator);
            int n = (this.numerator*fraction.numerator);
            Fraction newFraction = reduce(d, n);
            return newFraction;
        }

        public Fraction subtract(Fraction fraction) {
            int d = (- this.numerator*fraction.denominator + this.denominator*fraction.numerator);
            int n = (this.numerator*fraction.numerator);

            Fraction newFraction = reduce(d, n);
            return newFraction;
        }

        public Fraction multiply(Fraction fraction) {
            int d = (fraction.denominator)*(this.denominator);
            int n = (this.numerator*fraction.numerator);

            Fraction newFraction = reduce(d, n);
            return newFraction;
        }

        public Fraction divide(Fraction fraction) {
            int d = (fraction.numerator)*(this.denominator);
            int n = (this.numerator)*(fraction.denominator);

            Fraction newFraction = reduce(d, n);
            return newFraction;
        }

        public boolean equals(Object object) {
            if (object instanceof Fraction) {
                Fraction other = (Fraction) object;
                if (other.getDenominator() == other.getDenominator()) {
                    return true;
                } else  return false;
            }

            return false;
        }
}
