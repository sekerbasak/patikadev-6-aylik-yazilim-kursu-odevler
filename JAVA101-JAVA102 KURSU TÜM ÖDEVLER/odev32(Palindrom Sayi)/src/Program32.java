import java.util.Scanner;

public class Program32 {


    // Bir sayının palindrom olup olmadığını kontrol eden metot
    static boolean isPolindrom(int number) {
        int temp = number, reversNumber = 0, lastNumber;

        while (temp != 0) {
            System.out.println("===============");
            System.out.println("Sayi= " + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak= " + lastNumber);// son basamağı bulduk
            reversNumber = (reversNumber * 10) + lastNumber;
            System.out.println("Yeni Sayi= " + reversNumber);
            temp /= 10;
        }

        // Sayının tersten okunmuş haliyle orijinal sayıyı karşılaştırarak palindrom olup olmadığını kontrol et
        if (number == reversNumber) {
            System.out.println(number + " palindrom bir sayıdır.");
            return true;
        } else {
            System.out.println(number + " palindrom bir sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sayi giriniz: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        isPolindrom(number);
    }
}