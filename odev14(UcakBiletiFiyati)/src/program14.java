import java.util.*;
public class program14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden girin: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini girin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double birimFiyat = 0.10;
        double toplamFiyat = mesafe * birimFiyat;

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            toplamFiyat *= 0.7; // %30 indirim
        }

        if (yolculukTipi == 2) {
            toplamFiyat *= 0.8; // %20 indirim
        }

        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
    }

}
