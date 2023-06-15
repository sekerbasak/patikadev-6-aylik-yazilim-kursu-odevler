import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		
		System.out.println("Dairenin yarıçap değerini giriniz");
		double pi=3.14;
		Scanner input=new Scanner(System.in);
		double yaricap=input.nextDouble();
		double daire_alan=pi*yaricap*yaricap;
		double daire_cevre=2*pi*yaricap;
		System.out.print("Dairenin Çevresi: "+daire_cevre+"\n");
		System.out.print("Dairenin Alanı: "+daire_alan);
	}

}
