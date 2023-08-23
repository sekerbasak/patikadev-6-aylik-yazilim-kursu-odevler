import java.util.Scanner;


public class program24 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Elmasın boyutunu girin (tek sayı olmalı): ");
	        int boyut = scanner.nextInt();

	        int yildizSayisi = 1;
	        int boslukSayisi = boyut / 2;

	        // Üst kısmı çiz
	        for (int i = 0; i < boyut / 2 + 1; i++) {
	            for (int j = 0; j < boslukSayisi; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < yildizSayisi; j++) {
	                System.out.print("*");
	            }
	            System.out.println();

	            boslukSayisi--;
	            yildizSayisi += 2;
	        }

	        // Alt kısmı çiz
	        boslukSayisi = 1;
	        yildizSayisi = boyut - 2;
	        for (int i = 0; i < boyut / 2; i++) {
	            for (int j = 0; j < boslukSayisi; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < yildizSayisi; j++) {
	                System.out.print("*");
	            }
	            System.out.println();

	            boslukSayisi++;
	            yildizSayisi -= 2;
	        }

	}

}
