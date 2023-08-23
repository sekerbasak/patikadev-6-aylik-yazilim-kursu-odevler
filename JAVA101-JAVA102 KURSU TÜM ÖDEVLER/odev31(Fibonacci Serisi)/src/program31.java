import java.util.Scanner;

public class program31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi kac eleman olsun: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        int toplam = 0;

        System.out.println(sayi1 + " + " + sayi2 + " = " + sayi2);

        for (int i = 3; i <= elemanSayisi; i++) {
            toplam = sayi1 + sayi2;
            System.out.println(sayi2 + " + " + sayi1 + " = " + toplam);
            sayi1 = sayi2;
            sayi2 = toplam;
        }

	}

}
