import java.util.*;
public class program10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Matematik dersi notunu girin: ");
	        int matematik = scanner.nextInt();

	        System.out.print("Fizik dersi notunu girin: ");
	        int fizik = scanner.nextInt();

	        System.out.print("Türkçe dersi notunu girin: ");
	        int turkce = scanner.nextInt();

	        System.out.print("Kimya dersi notunu girin: ");
	        int kimya = scanner.nextInt();

	        System.out.print("Müzik dersi notunu girin: ");
	        int muzik = scanner.nextInt();

	        int toplam = 0;
	        int dersSayisi = 0;

	        if (matematik > 0 && matematik < 100) {
	            toplam += matematik;
	            dersSayisi++;
	        }

	        if (fizik > 0 && fizik < 100) {
	            toplam += fizik;
	            dersSayisi++;
	        }

	        if (turkce > 0 && turkce <100) {
	            toplam += turkce;
	            dersSayisi++;
	        }

	        if (kimya > 0 && kimya < 100) {
	            toplam += kimya;
	            dersSayisi++;
	        }

	        if (muzik > 0 && muzik < 100) {
	            toplam += muzik;
	            dersSayisi++;
	        }

	        if (dersSayisi > 0) {
	            double ortalama = (double) toplam / dersSayisi;
	            System.out.println("Ortalama: " + ortalama);

	            if (ortalama < 55) {
	                System.out.println("Geçtiniz");
	            } else {
	                System.out.println("Kaldınız");
	            }
	        } else {
	            System.out.println("Hatalı not girişi yapıldı. Lütfen 0-100 aralığında notlar girin.");
	        }

	}

}
