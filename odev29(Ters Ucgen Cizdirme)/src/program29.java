import java.util.Scanner;
public class program29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
