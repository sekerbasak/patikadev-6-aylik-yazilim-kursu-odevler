import java.util.Scanner;
public class ana {

	public static void main(String[] args) 
	{
	    Scanner reader=new Scanner(System.in);
        int turkce,matematik,fizik,tarih,kimya,muzik,ortalama;
        System.out.print("Türkçe : ");
        turkce=reader.nextInt();
        System.out.print("Matematik : ");
        matematik=reader.nextInt();
        System.out.print("Fizik : ");
        fizik=reader.nextInt();
        System.out.print("Kimya : ");
        kimya=reader.nextInt();
        System.out.print("Müzik : ");
        muzik=reader.nextInt();
        System.out.print("Tarih : ");
        tarih=reader.nextInt();
        ortalama=(turkce+matematik+fizik+muzik+tarih+kimya)/6;
        System.out.println("Ortalamanız : "+ortalama);
        String durum = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
	

	

}
