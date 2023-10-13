
public class Main {

	public static void main(String[] args) {
		
		//encapsulation
		//inheritence
		//poliformifim
		//abstraction
		
		book harryPotterBook =new book("harryPotter", 1150);
		book lordOfRingsBook=new book("lord pf rings", 478);
		lordOfRingsBook.setName("lotr");
		lordOfRingsBook.setPage(-12);
		System.out.println(lordOfRingsBook.getName());
        System.out.println(lordOfRingsBook.getPage());
	}

}
