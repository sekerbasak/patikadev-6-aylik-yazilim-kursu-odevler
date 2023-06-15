import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		double armut_kg=2.14; double elma_kg=3.67; double domates_kg=1.11; double muz_kg=0.95; double patlican_kg=5;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Armut Kaç Kilo?");
		double Armut=input.nextDouble();
		System.out.println("Elma Kaç Kilo?");
		double Elma=input.nextDouble();
		System.out.println("Domates Kaç Kilo?");
		double Domates=input.nextDouble();
		System.out.println("Muz Kaç Kilo?");
		double Muz=input.nextDouble();
		System.out.println("Patlican Kaç Kilo?");
		double Patlican=input.nextDouble();
		
		double toplam_tutar=armut_kg*Armut+elma_kg*Elma+domates_kg*Domates+muz_kg*Muz+patlican_kg*Patlican;

		System.out.println("Toplam Tutar: "+toplam_tutar);
	}

}
