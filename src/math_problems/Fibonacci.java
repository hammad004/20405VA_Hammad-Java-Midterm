package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

       static void Fibonacci(int n) {
    int num1 = 0, num2 = 1;
    int counter = 0;
    while (counter < n) {
        System.out.println(num1 + " ");
        int num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        counter = counter + 1;
    }
        }
        public static void main(String[] args) {
           int n = 40;
           Fibonacci(n);
    }

}
