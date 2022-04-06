package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */
static int factorial(int n) {
    if (n != 0)
        return n*factorial(n-1);
    else
        return 1;
}
    public static void main(String[] args) {
int number = 6, result;
result = factorial(number);
        System.out.println(number + " factorial = " + result);

    }

}
