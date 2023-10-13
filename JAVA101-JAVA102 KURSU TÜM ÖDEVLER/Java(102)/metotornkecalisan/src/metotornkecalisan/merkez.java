package metotornkecalisan;

import java.util.Scanner;

public class merkez {

	public static void main(String[] args) {
		
		
		System.out.println("---Uygulamaya hos geldiniz---");
		Scanner input=new Scanner(System.in);
		System.out.print("Calisanın no değerini giriniz: ");
		int no=input.nextInt();
		System.out.print("Calisanın isim değerini giriniz: ");
        String isim=input.next();
        System.out.print("Calisanın soyisim değerini giriniz: ");
        String soyisim=input.next();
		System.out.print("Calisanın tecrübe değerini giriniz: ");
		int tecrube=input.nextInt();
		System.out.print("Calisanın maaş değerini giriniz: ");
		int maas=input.nextInt();
		System.out.println("Yapacaginiz islemi seciniz: ");
		String islemler="1-Calisanın Bilgilerini Goster\n 2-Zam Yap \n3-Format At";
		calisan Calisan=new calisan(no, isim, soyisim,tecrube,maas);
	     System.out.println(islemler);
	
	String islem=input.next();
	if (islem.equals("1")) 
	{
		Calisan.calisanBilgiGoster();
		
	}
	else if (islem.equals("2")) {
		System.out.print("Yapılacak zam değerini giriniz: ");
		Double zam=input.nextDouble();
		Calisan.zamYap(zam);
		
	}
	else if (islem.equals("3")) {
		System.out.print("Kim format atıyor?");
		String kim=input.next();
		System.out.println(kim+ " hangi isletim sistemine format atıyor?");
		String isletim=input.next();
		Calisan.formatAt(kim,isletim);
		
	}
	else {
		System.out.println("Programdan cikis yapılıyor");
	}
	}

}
