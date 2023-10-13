import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		
		System.out.println("Tutar giriniz: ");
		double price=inputScanner.nextDouble();
		System.out.println("Kart No giriniz: ");
		String cardnumber=inputScanner.next();
		System.out.println("Son kullanım tarihini giriniz: ");
		String date=inputScanner.next();
		System.out.println("Güvenlik kodunu giriniz: ");
		String cvc=inputScanner.next();
		
		System.out.println("1- A bankası");
		System.out.println("2- B bankası");
		System.out.println("3- C bankası");
		System.out.println("İşlem için banka seçimi yapınız");
		int select=inputScanner.nextInt();
		switch (select) {
		case 1: 
			BankA aPos=new BankA("A bankasi", "212443", "1453");
			aPos.connect(aPos.hostIPAddressString);
			aPos.payment(price, cardnumber, date, cvc);
			
			
			break;
			
		
       case 2: 
			
			
       case 3: 
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		
 
	}
	}
}
