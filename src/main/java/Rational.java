public class Rational {
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
    }
    
    // This method takes two Rationals, add them up,
    // and returns a Rational equal to the sum
    // You will need to:
    // 1) Calculate the value of the new numerator
    // 2) Calculate the value of the new denominator
    // 3) Create a new Rational variable with the two above values
    // 4) Return your new Rational variable
    // (When you write the simplify method later on, you should
    // also call it in this method to return the simplified result)
    public static Rational add(Rational r, Rational s) {
        int num1 = r.numerator;
        int den1 = r.denominator;
        int num2 = s.numerator;
        int den2 = s.denominator;
        int newnum1 = num1 * den2;
        int newnum2 = num2 * den1;
        int newden1 = den1 * den2;
        int newden2 = newden1;
        int numsum = newnum1 + newnum2;
        Rational sum = new Rational(numsum, newden2);
        return simplify(sum);





    }

    // This method takes two Rationals, subtracts thems up, 
    // and returns a Rational equal to the difference
    public static Rational subtract(Rational r, Rational s) {
        int num1 = r.numerator;
        int den1 = r.denominator;
        int num2 = s.numerator;
        int den2 = s.denominator;
        int newnum1 = num1 * den2;
        int newnum2 = num2 * den1;
        int newden1 = den1 * den2;
        int newden2 = newden1;
        int numsum = newnum1 - newnum2;
        Rational sum = new Rational(numsum, newden2);
        return simplify(sum);
    }
    
    public static Rational multiply(Rational r, Rational s) {
        int num = r.numerator * s.numerator;
        int den = r.denominator * s.denominator;
        Rational multiple = new Rational(num,den);
        return simplify(multiple);
    }
    
    public static Rational divide(Rational r, Rational s) {
        int num = r.numerator * s.denominator;
        int den  = r.denominator * s.numerator;
        Rational quotient = new Rational(num,den);
        return simplify(quotient);
    }

    // Finds the greatest common factor between a and b
    // To find the greatest common factor, find the largest number x
    // such that a and b are both multiples of x
    public static int greatestCommonFactor(int a, int b){
        int x = 1;
        for(int i = Math.min(a,b); i>= 1; i--){
            if (a%i == 0 && b%i == 0){
                x = i;
                break;
            }
        }
        return x;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // Use the greatestCommonFactor method here
    // e.g. simplify(2/4) => 1/2
    //      simplify(1/2) => 1/2
    public static Rational simplify(Rational r) {
        int divisor = greatestCommonFactor(r.numerator,r.denominator);
        int new_num = r.numerator/divisor;
        int new_den = r.denominator/divisor;
        Rational simplified = new Rational(new_num,new_den);
        return simplified;
    }

    // This following method is NOT static, we'll talk about it next class!
    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}













