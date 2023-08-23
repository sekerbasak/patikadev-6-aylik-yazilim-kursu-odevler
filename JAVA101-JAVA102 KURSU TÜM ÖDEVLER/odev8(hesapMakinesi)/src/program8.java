import java.util.*;
public class program8 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        
        System.out.println("İşlem seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        
        int secim = scanner.nextInt();
        
        double sonuc = 0;
        
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                }
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;

	}
	}
}
