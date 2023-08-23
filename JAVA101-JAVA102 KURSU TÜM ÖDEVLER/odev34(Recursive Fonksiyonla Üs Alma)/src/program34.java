
import java.util.Scanner;

public class program34 {

    // Recursive method to calculate exponentiation
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: Any number raised to the power of 0 is 1
        } else {
            return base * power(base, exponent - 1); // Recursive step: Multiply base with the result of power(base, exponent - 1)
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter base value: ");
        int base = scan.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);

        System.out.println("Result: " + result);
    }
}
