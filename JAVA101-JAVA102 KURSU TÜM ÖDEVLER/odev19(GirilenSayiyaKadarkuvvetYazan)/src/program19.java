import java.util.Scanner;
public class program19 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Bir sayı girin: ");
	        int n = scanner.nextInt();

	        System.out.println("4 ve 5'in kuvvetleri:");

	        for (int i = 1; i <= n; i++) {
	            System.out.println("4^" + i + " = " + Math.pow(4, i));
	            System.out.println("5^" + i + " = " + Math.pow(5, i));
	        }

	}

}
