package odev1_son_deneme;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Writer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;


public class ana {

	public static void main(String[] args) {

//		 // Komut satırından dosya yolu parametresi alınıyor
		Scanner input=new Scanner(System.in);
		String dosyaYolu = input.next();

       // Dosya okuma işlemi try-catch bloğu içinde yapılıyor
       try
       {
           // Dosya okuma işlemleri
           FileReader fileReader = new FileReader(dosyaYolu);
           BufferedReader bufferedReader = new BufferedReader(fileReader);

           // Yorumların yazılacağı dosyaların tanımlanması ve oluşturulması
           File teksatirDosya = new File("teksatir.txt");
           if (!teksatirDosya.exists()) {
               teksatirDosya.createNewFile();
           }

           File coksatirDosya = new File("coksatir.txt");
           if (!coksatirDosya.exists()) {
               coksatirDosya.createNewFile();
           }

           File javadocDosya = new File("javadoc.txt");
           if (!javadocDosya.exists()) {
               javadocDosya.createNewFile();
           }

           // Dosya okuma işlemi
           String satir;
           int tekSatirYorumSayac=0;
           int cokluSatirYorumSayac=0;
           int javadocYorumSayac=0;
           while ((satir = bufferedReader.readLine()) != null) {
               // Satırdaki yorum türünü kontrol etmek için flag değişkenleri tanımlanıyor
               boolean tekSatirYorum = false;
               boolean cokSatirYorum = false;
               boolean javadoc = false;
               

               // Satırın başındaki ve sonundaki boşlukları temizleyerek işlem yapılıyor
               satir = satir.trim();

               // Satır boş değilse ve yorum satırıysa işlem yapılıyor
               if (!satir.isEmpty() && satir.startsWith("//")) {
                   // Tek satırlık yorum olduğu için tekSatirYorum flag'i true olarak işaretleniyor
            	   tekSatirYorumSayac++;
                   tekSatirYorum = true;
                   cokSatirYorum = false;
                   javadoc = false;
               } else if (!satir.isEmpty() && satir.startsWith("/*")) {
                   // Çok satırlı yorum başladığı için cokSatirYorum flag'i true olarak işaretleniyor
            	   cokluSatirYorumSayac++;
                   cokSatirYorum = true;
                   tekSatirYorum = false;
                   javadoc = false;
               } else if (!satir.isEmpty() && satir.startsWith("/**")) {
                   // Javadoc başladığı için javadoc flag'i true olarak işaretleniyor
            	   javadocYorumSayac++;
                   javadoc = true;
                   cokSatirYorum = false;
                   tekSatirYorum = false;
               }
              
               BufferedWriter coksatirYazici = new BufferedWriter(new FileWriter(coksatirDosya, true));
               BufferedWriter javadocYazici = new BufferedWriter(new FileWriter(javadocDosya, true));

               // Yorum satırı ile karşılaşıldığında, yorumların yazılacağı dosyaya yazılıyor
               if (tekSatirYorum || cokSatirYorum || javadoc) {
                   // İlgili dosyaya yazılacak BufferedWriter nesnesi oluşturuluyor
            	   BufferedWriter yazici;
            	   String tekSatirYorumSayacstr = Integer.toString(tekSatirYorumSayac);
            	   String cokluSatirYorumSayacstr = Integer.toString(cokluSatirYorumSayac);
            	   String javadocYorumSayacStr = Integer.toString(javadocYorumSayac);

                   if (tekSatirYorum) {
                	    yazici = new BufferedWriter(new FileWriter(teksatirDosya, true));
                	    yazici.write("Tek Satir Yorum Sayisi: " + tekSatirYorumSayacstr);
                   } else if (cokSatirYorum) {
                	    yazici = new BufferedWriter(new FileWriter(coksatirDosya, true));
                	    coksatirYazici.write("Cok Satir Yorum Sayisi: " + cokluSatirYorumSayacstr);
                	   
                   } else {
                	    yazici = new BufferedWriter(new FileWriter(javadocDosya, true));
                	    javadocYazici.write("Javadoc Yorum Sayisi: " + javadocYorumSayacStr);
                    } yazici.close();
                  
               }
                }
           bufferedReader.close();
           fileReader.close();
           } catch (IOException e) {
               System.out.println("Dosya okuma hatası: " + e.getMessage());
           }
		
		fonksiyonAnalizi(dosyaYolu);
		}
	
	public static void fonksiyonAnalizi(String dosyaYolu) {
	   
	}
	









}