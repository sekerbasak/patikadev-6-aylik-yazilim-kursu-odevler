import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Boyunuzu giriniz: ");
		double boy=input.nextDouble();
		System.out.print("Kilonuzu giriniz: ");
		double kilo=input.nextDouble();
		double index_degeri=kilo/(boy*boy);
		System.out.println("Vücut kitle indeksiniz: "+index_degeri);

	}

}
