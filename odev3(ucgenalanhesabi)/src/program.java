import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		System.out.println("Üçgenin 1. kenarını giriniz: ");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		System.out.println("Üçgenin 2. kenarını giriniz: ");
		double b=input.nextDouble();
		System.out.println("Üçgenin 3. kenarını giriniz: ");
		double c=input.nextDouble();
 
		double u=(a+b+c)/2;
		double alan= u * (u-a)* (u-b) * (u-c);
		System.out.println("Üçgenin Alanı: "+Math.pow(alan, 0.5));
	}

}
