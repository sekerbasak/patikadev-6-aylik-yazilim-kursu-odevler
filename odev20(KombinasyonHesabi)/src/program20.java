import java.util.Scanner;
public class program20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        // Kombinasyonu hesapla
        long kombinasyon = kombinasyonHesapla(n, r);

        // Sonucu ekrana yazdır
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
	}
	
	public static long faktoriyel(int sayi) {
        long faktoriyel = 1;
        for (int i = 2; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    public static long kombinasyonHesapla(int n, int r) {
        long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }

}
