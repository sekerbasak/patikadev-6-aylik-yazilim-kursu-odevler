
public class Calisan {

	private String adSoyad;
	private String telefon;
	private String eposta;
	public Calisan(String adSoyad, String telefon, String eposta) {
		super();
		this.adSoyad = adSoyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	public void giris() {
		System.out.println(this.adSoyad+" Üniversiteye giriş yaptı");
	}
	
	public void cikis() {
		System.out.println(this.adSoyad+" Üniversiteden cikis yaptı");
	}
	public void yemekhane() {
		System.out.println(this.adSoyad+" Yemekhaneye giriş yaptı");
	}
	
	public static void girisYapanlar(Calisan[] loginusers) {
		for (Calisan calisan : loginusers) {
			calisan.giris();
		}
	}

}
