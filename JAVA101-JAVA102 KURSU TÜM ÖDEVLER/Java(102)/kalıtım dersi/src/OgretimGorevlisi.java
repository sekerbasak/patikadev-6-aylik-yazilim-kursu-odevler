
public class OgretimGorevlisi extends Akademisyen //kalıtım aldığı sınıfın contructorını almak zorunda
{
	 private int kapiNo;

	public OgretimGorevlisi(String adsoyad, String telefon, String eposta, String bolum, String unvan, int kapiNo) {
		super(adsoyad, telefon, eposta, bolum, unvan);//akademisyene ait contructurenın aynısı yazılır.
		this.kapiNo = kapiNo; 
	}

	public int getKapiNo() {
		return kapiNo;
	}

	public void setKapiNo(int kapiNo) {
		this.kapiNo = kapiNo;
	}
	 public void senatoYoplanti() {
		 System.out.println(getAdSoyad()+" senato toplantısı yaptı.");
		
	}public void sinavyap() {
		System.out.println(getAdSoyad()+" sınavı oluşturdu");
	}
	@Override
	public void Dersegiris(String saat) {
		System.out.println(this.getAdSoyad()+ " öğretim görevlisi derse "+ saat +" saatinde girdi");
	};

}
