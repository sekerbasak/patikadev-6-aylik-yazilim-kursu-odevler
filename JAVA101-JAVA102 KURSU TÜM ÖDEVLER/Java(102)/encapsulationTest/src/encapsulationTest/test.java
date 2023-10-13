package encapsulationTest;

import java.util.Scanner;

import com.sekerbasak.model.Calisan;

public class test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//AŞAĞIDAKİ BÖLGEDE KAPSÜLLEME CONSTRUCTOR İLE YAĞILMIŞTIR
		 System.out.print("ID değerini giriniz");
		 Long id=input.nextLong();
        System.out.print("İsim değerini giriniz");
        String isim=input.next();
         System.out.print("Soyisim değerini giriniz");
         String soyisim=input.next();
//
//         Calisan calisan=new Calisan(id,isim,soyisim);
//         calisan.goruntule();
         
         
         
         //AŞAĞIDAKİ BÖLMEDE GET VE SET METOTLARI İLE YAPILMIŞTIR
		 Calisan calisan=new Calisan();
         calisan.setId(id);//sette değer doldurulur
         calisan.getId(); //gette değer döndürülür
         calisan.setName(isim);
         calisan.setSurname(soyisim);
      
         
         System.out.println("ID: "+calisan.getId());
         System.out.println("İSİM: "+calisan.getName());
         System.out.println("SOYİSİM: "+calisan.getSurname());
         
         
         }

}
