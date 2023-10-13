package com.sekerbasak.model;

public class Calisan {
	private long id;
	private String name;
	private String surname;
	/*
	 private değerlere kendi sınıfının dışında hiç kimse erişemez.
	başka yerlerden erişmenin 2 yolu vae:
	1)Constructor
    2)get ve set netotları ile
    
     */
	
	//AŞAĞIDAKİ BÖLMEDE CONTRUCTOR İLE YAPILMIŞTIR!
	public Calisan(long id, String name, String surname) {
		
		this.id = id;                                  //ALT+SHİFT+S constructor kısayolu
		this.name = name;
		this.surname = surname;
	}
//	public void goruntule() {
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(surname);
//	}
	
	
	
	public Calisan() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {  
		if (id>10) {
			System.out.println("id no 10'dan büyük olamaz");
		}else if (id<0) {
			System.out.println("id 0dan küçük olamaz!");
		}
		else {
			this.id = id;
		}
		
	}
	
	
	
	public String getName() { // get geriye değer döndürür.
		return name;
	}
	public void setName(String name) {  //set geriye değer döndürmez sadece değişkene değer atar
		this.name=name;
		
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
