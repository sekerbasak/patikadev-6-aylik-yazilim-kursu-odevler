package pdp_odev1;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;

public class analiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//	isimyazdir();
//	topla(23, 11);
//	int sonuc=carp(5, 3);
//	System.out.println(sonuc);
		System.out.println("Dizinin eleman sayısını giriniz");
		int adet = input.nextInt();
		int[] sayilar = new int[adet];
		for (int i = 0; i < adet; i++) {
			System.out.print(i + 1 + ". sayıyı giriniz :");
			int sayi = input.nextInt();
			sayilar[i] = sayi;

		}
		for (int i : sayilar) {
			ciftMitekMi(i);
		}

	}

	public static void ciftMitekMi(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("Sayı çifttir");

		} else {
			System.out.println("Sayı tektir");
		}

	}
//	public static void isimyazdir()//parametresiz ve geriye değer döndürmeyen
//	{
//		System.out.println("basak");
//		
//	}
//	public static void topla(int sayi1,int sayi2)//parametreli geriye değer döndürmeyen
//	{
//		int sonuc=sayi1+sayi2;
//		System.out.println(sonuc);
//	}
//	public static int carp( int say1,int say2) {
//		int sonuc =say1*say2;
//		return sonuc;
//	}

	// girilen sayı tek mi çift mi koşul,döngü ,dizi,metod

}
