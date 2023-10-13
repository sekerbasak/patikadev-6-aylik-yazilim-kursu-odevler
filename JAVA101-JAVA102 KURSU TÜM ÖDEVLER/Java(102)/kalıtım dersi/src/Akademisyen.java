
public abstract class Akademisyen extends Calisan{
	private String bolum;
	private String unvan;
	
	public Akademisyen(String adsoyad, String telefon, String eposta,String bolum,String unvan) {
		super(adsoyad, telefon, eposta);
		this.bolum=bolum;
		this.unvan=unvan;
	}
	
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	public  abstract void Dersegiris(String dersSaati);
	public void derseGir()
{
		System.out.println(this.getAdSoyad()+" derse girdi!");
}
}
