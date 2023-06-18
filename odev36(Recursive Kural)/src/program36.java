import java.util.Scanner;

public class program36 {
    
    // Recursive method to apply the number manipulation rule
    static void manipulateNumber(int n) {
        if (n <= 0) {
            System.out.print(n + " "); // Print the current value
            return;
        }
        
        System.out.print(n + " "); // Print the current value
        
        manipulateNumber(n - 5); // Recursive call by subtracting 5
        
        System.out.print(n + " "); // Print the current value after recursive call
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("N Sayısı: ");
        int n = scan.nextInt();
        
        manipulateNumber(n);
    }
}
