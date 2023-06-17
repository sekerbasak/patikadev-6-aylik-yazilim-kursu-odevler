import java.util.Scanner;


public class program22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Sayiyi Giriniz: ");
        int number= scanner.nextInt();
        int tempnumber=number;
        int basamakvalue;
        int sayac=0;
        while(tempnumber!=0) {
        	tempnumber/=10;
        	sayac++;
        }
        tempnumber=number;
        
        int toplam=0;
        while(tempnumber!=0) {
        	basamakvalue=tempnumber%10;
        	System.out.print(""+basamakvalue+",");
        	tempnumber/=10;
        	toplam+=basamakvalue;
        }
       System.out.println("\n"+"Sayı değerleri toplamı ="+toplam);

	}

}
