package ders12;
import java.util.Scanner;
public class uygulama12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Birinci sayıyı girin: ");
	        int sayi1 = scanner.nextInt();
	        
	        System.out.print("İkinci sayıyı girin: ");
	        int sayi2 = scanner.nextInt();
	        
	        System.out.print("Üçüncü sayıyı girin: ");
	        int sayi3 = scanner.nextInt();
	        
	        int enKucuk = 0;
	        int ortanca = 0;
	        int enBuyuk = 0;
	        
	        // En küçük sayıyı bulma
	        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
	            enKucuk = sayi1;
	            if (sayi2 <= sayi3) {
	                ortanca = sayi2;
	                enBuyuk = sayi3;
	            } else {
	                ortanca = sayi3;
	                enBuyuk = sayi2;
	            }
	        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
	            enKucuk = sayi2;
	            if (sayi1 <= sayi3) {
	                ortanca = sayi1;
	                enBuyuk = sayi3;
	            } else {
	                ortanca = sayi3;
	                enBuyuk = sayi1;
	            }
	        } else {
	            enKucuk = sayi3;
	            if (sayi1 <= sayi2) {
	                ortanca = sayi1;
	                enBuyuk = sayi2;
	            } else {
	                ortanca = sayi2;
	                enBuyuk = sayi1;
	            }
	        }
	        
	        System.out.println("Küçükten büyüğe sıralama: " + enKucuk + ", " + ortanca + ", " + enBuyuk);
	    }

}
