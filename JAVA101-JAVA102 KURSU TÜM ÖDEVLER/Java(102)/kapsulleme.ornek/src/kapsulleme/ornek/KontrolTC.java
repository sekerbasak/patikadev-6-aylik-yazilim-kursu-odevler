package kapsulleme.ornek;

import java.util.Random;

public class KontrolTC {
	private String TC;
	private long seriNo;
	private String dogumYeri;

	public String getTC() {
		return TC;
	}

	public void setTC(String tC) {
		
		    if (tC.length() != 11 || !tC.matches("[0-9]{11}")) {
		        System.out.println("Lütfen geçerli bir 11 haneli TC kimlik numarası giriniz.");
		    } 
		    else {
		    	if (tC.startsWith("0")) {
					System.out.println("TC kimlik numarası 0 ile başlayamaz");
		
		    	}
		    	else {
		    		this.TC=tC;
					Random rastgele=new Random();
					int gise=rastgele.nextInt(100);
					System.out.println("Gişe numarası: "+gise);
				}
				
			}
	}

	public long getId() {
		return seriNo;
	}

	public void setId(long id) {
		this.seriNo = id;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	
	
	

}
