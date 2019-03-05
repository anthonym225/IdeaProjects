package recursionpractice;

public class RecursionPractice {

    public static int Summation(int n) {
        // Base Case = end
        if (n <= 0) {
            return 0;
        }
        // Recursive Case = keep going
        else {
            return n + Summation(n - 1);
        }
    }

    public static int Factorial(int n) {
        // Base Case
        if (n <= 1) {
            return 1;
        }
        // Recursive Case
        else {
            return n * Factorial(n - 1);
        }
    }

    public static int Exponentiation(int n, int p) {
        // Base Case
        if (p <= 0) {
            return 1;
        }
        // Recursive Case
        else {
            return n * Exponentiation(n, p - 1);
        }
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println("Summation 3 = " + Summation(3));
        System.out.println("Factorial 4 = " + Factorial(4));
        System.out.println("5^3 = " + Exponentiation(5, 3));
    }
}
