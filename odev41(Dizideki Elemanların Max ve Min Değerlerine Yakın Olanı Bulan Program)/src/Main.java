import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int input = scanner.nextInt();

        int closestGreater = Integer.MAX_VALUE;
        int closestSmaller = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > input && number < closestGreater) {
                closestGreater = number;
            }
            if (number < input && number > closestSmaller) {
                closestSmaller = number;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreater);
    }
}
