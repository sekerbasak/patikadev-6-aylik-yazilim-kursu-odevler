import java.util.*;
public class program9 {

	public static void main(String[] args) {
String dogruSifre = "sekerbasak";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();
        
        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Şifre yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = scanner.nextLine();
            
            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifreyi girin: ");
                String yeniSifre = scanner.nextLine();
                
                if (!yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturuldu!");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }

	}

}
