package nesne;

import basakseker.Ogrenci;//hnagi java modülü olduğunu da ekledik 

public class merkez {

	public static void main(String[] args) {
	   	Ogrenci ogrenci1=new Ogrenci(7,"sinem","turgut");//sınıftan nesne türettik şimdi de o nesneyi kullanacağız
	   	
//		Ogrenci ogrenci2=new Ogrenci("Erkek"); ogrenci1.id=5;
//		 ogrenci1.isim="Başak";
//		 ogrenci1.soyisim="Şeker";
		 System.out.println("Öğrencinin Bİlgileri");
		 System.out.println("ID: "+ogrenci1.id);
		 System.out.println("İsim: "+ogrenci1.isim);
		 System.out.println("Soyisim: "+ogrenci1.soyisim);
//		 System.out.println("Cinsiyet: "+ogrenci2.cinsiyet);
		//Constructor (yapıcı metod)unu öğreneceğiz.
	    //CONSTRUCTOR NESNE TÜRETİLDİĞİ ZAMAN ÇALIŞAN BİR FONKSİYON GİBİ DÜŞÜNÜLEBİLİR!

		 /*ERİŞİM BELİRLEYİCİLER
		  * 
		   PUBLİC: her yerden erişilebilir kısıtlama yok
		   PRİVATE: sadece bulunduğu class içinden erşilebilir.
		   PROTECTED: buludğu classs içinden ya da classı miras alan alt classlardan erişilebilir
		  * 
		  */
	}

}
