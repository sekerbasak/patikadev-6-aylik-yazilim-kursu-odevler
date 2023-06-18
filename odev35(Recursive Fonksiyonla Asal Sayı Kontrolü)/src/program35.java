
import java.util.Scanner;

public class program35 {
    
    // Recursive method to check if a number is prime
    static boolean isPrime(int number, int divisor) {
        if (divisor <= 1) {
            return true; // Base case: Number is prime if the divisor is 1 or less
        } else {
            if (number % divisor == 0) {
                return false; // If the number is divisible by the divisor, it's not prime
            } else {
                return isPrime(number, divisor - 1); // Recursive step: Check with the next divisor
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();
        
        boolean isNumberPrime = isPrime(number, number - 1);
        
        if (isNumberPrime) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }
}