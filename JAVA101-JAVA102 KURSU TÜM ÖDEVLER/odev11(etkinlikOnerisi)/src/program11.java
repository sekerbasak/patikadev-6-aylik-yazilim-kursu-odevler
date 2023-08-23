import java.util.Scanner;
public class program11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Sıcaklık değerini girin: ");
	        int sicaklik = scanner.nextInt();
	        
	        String etkinlik = "";
	        
	        etkinlik = sicaklik < 5 ? "Kayak" : 
	                   (sicaklik >= 5 && sicaklik <= 15) ? "Sinema" :
	                   (sicaklik > 15 && sicaklik <= 25) ? "Piknik" :
	                   "Yüzme";
	        
	        System.out.println("Bugün için önerilen etkinlik: " + etkinlik);
	    }

}
