
public class book {

	private String name;
	private int pageNumber;
	
	public book(String name, int pageNumber) {
		this.name=name;
		this.pageNumber=pageNumber;
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPage() {
		return this.pageNumber;
	}
	public void setPage(int pageNumber) {
		if(!(pageNumber<0))
		this.pageNumber=pageNumber;
		else {
			System.out.println("geçersiz sayı girdiniz!");
			this.pageNumber=0;
		}
	}
}
