package basakseker;

public class Ogrenci {
	public int id;
	public String isim;
	public String soyisim;
	private String cinsiyet;
	
	
	public Ogrenci() {//constructorun geriye dönüş tipi olmaz!!!
		
		System.out.println("Öğrenci sınıfının yapıcı metodu çalıştı!");
	}
	public Ogrenci(int id,String isim,String soyisim) {
		//this=şu an üzerinde çalışılan class
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
	}
	public Ogrenci(String cinsiyet) {
		this.cinsiyet=cinsiyet;
	}

}
