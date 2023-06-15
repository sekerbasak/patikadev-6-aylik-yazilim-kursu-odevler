
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Ücret tutarını giriniz..");
		double tutar=reader.nextDouble();
		double KDV;
		if (tutar>0 && tutar<1000) 
		{
			 KDV= 0.18d;
			 System.out.println("KDV'siz fiyat: "+(tutar));
				System.out.println("KDV'li fiyat: "+(tutar+tutar*KDV));
				System.out.println("KDV: "+ KDV);
		} else {
			KDV=0.08d;
			System.out.println("KDV'siz fiyat: "+(tutar));
			System.out.println("KDV'li fiyat: "+(tutar+tutar*KDV));
			System.out.println("KDV: "+ KDV);
		}
		
		
		

	}

}
