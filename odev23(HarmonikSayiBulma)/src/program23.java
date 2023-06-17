import java.util.Scanner;

public class program23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int N = scanner.nextInt();
        double toplam=0;
        for (double i = 1; i <= N; i++) 
        {
			toplam+=(1/i);
		}
        System.out.println("Harmonik Ortalama: "+ toplam);

	}

}
