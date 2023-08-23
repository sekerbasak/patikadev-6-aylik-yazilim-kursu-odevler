import java.util.Scanner;
public class program18 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        int sum = 0;
	        int number;

	        do {
	            System.out.print("Bir sayı girin (Çıkmak için 0): ");
	            number = scanner.nextInt();

	            if (number % 2 == 0 && number % 4 == 0) {
	                sum += number;
	            }
	        } while (number != 0);

	        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
	    }

}
