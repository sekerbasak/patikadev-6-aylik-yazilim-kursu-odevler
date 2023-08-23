import java.util.Scanner;

public class program {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		int mesafe=input.nextInt();
		double perKm=2.20 ,total=10;
		
		total+=mesafe*perKm;
		
       if (total<20)
       {
	total=20;

         } System.out.println("Toplam Ücret: "+ total);
	}

}
