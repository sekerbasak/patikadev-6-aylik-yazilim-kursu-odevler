package metotornkecalisan;

public class calisan {
	
    public int no;
    public String isim;
    public String soyisim;
    public double maas;
    public int tecrube;
    
//    public calisan(int no,String isim, String soyisim,int tecrube,double maas) {
//	
//    	this.no=no;
//    	this.isim=isim;
//    	this.soyisim=soyisim;
//    	this.tecrube=tecrube;
//    	this.maas=maas;
//	  
    
    public calisan(int no, String isim, String soyisim, double maas, int tecrube) {
    	super();
    	this.no = no;
    	this.isim = isim;
    	this.soyisim = soyisim;
    	this.maas = maas;
    	this.tecrube = tecrube;
    }
    
    public void calisanBilgiGoster() 
    {
    	System.out.println("-----ÇALIŞAN BİLGİLERİ-----");
    	System.out.println("İsim: "+no);
    	System.out.println("İsim: "+isim);
    	System.out.println("İsim: "+soyisim);
    	System.out.println("İsim: "+tecrube);
    	System.out.println("İsim: "+maas);
    }

    public void zamYap(double zamdegeri) {
    	System.out.println("Maaşınıza "+ zamdegeri+"TL zam yapıldı.");
    	System.out.println("Şu anki güncel maaşınız: "+(maas+zamdegeri));
    }

    public void formatAt(String  isletimSistemi, String kim) {
		System.out.println(kim+" şu anda "+isletimSistemi+" işletim sistemine format atıyor");
	}
}
