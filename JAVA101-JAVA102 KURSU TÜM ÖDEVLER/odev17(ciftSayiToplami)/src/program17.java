import java.util.Scanner;
public class program17 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Bir sayı girin: ");
	        int n = scanner.nextInt();

	        int sum = 0;
	        int count = 0;

	        for (int i = 0; i <= n; i++) {
	            if (i % 3 == 0 && i % 4 == 0) {
	                sum += i;
	                count++;
	            }
	        }

	        if (count > 0) {
	            double average = (double) sum / count;
	            System.out.println("Ortalama: " + average);
	        } else {
	            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
	        }

	}

}
