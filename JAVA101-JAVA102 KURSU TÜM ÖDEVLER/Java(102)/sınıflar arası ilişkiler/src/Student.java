
public class Student {
	private String name;
	private String surname;
	private String idno;
	private String addres;
	private int note;
	
	public Student(String name,String surname, String idno, String address,int note) //constructor
	{
		this.name=name;
		this.surname=surname;
		this.idno=idno;
		this.addres=address;
		this.note=note;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	

}
