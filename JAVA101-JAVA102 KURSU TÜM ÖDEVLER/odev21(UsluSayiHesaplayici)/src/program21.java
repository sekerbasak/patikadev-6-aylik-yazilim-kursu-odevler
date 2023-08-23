import java.util.Scanner;

public class program21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("üssü alınacak sayi: ");
        int n = scanner.nextInt();

        System.out.print("üs olacak sayi: ");
        int r = scanner.nextInt();
        int total=1;
        for (int i = 1; i <=r; i++) 
        {
			total*=n;
			
		}
        System.out.println(n+"^"+r+" = "+total);

	}

}
