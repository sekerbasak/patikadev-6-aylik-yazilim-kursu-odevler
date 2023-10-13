package kapsulleme.ornek;
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		KontrolTC kontrolTC=new KontrolTC();
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen TC değerini giriniz: ");
		String inputTC=input.next();
		System.out.print("Lütfen doğum yerini giriniz: ");
		String dogum_yeri=input.next();
		System.out.print("Lütfen seri no değerini giriniz: ");
		long seri_no=input.nextLong();
		kontrolTC.setTC(inputTC);                             
		kontrolTC.setDogumYeri(dogum_yeri);
		kontrolTC.setId(seri_no);
		System.out.println("TC: "+kontrolTC.getTC());
		System.out.println("SERİ NO: "+kontrolTC.getId());
		System.out.println("DOĞUM YERİ: "+kontrolTC.getDogumYeri());
	}

}
