
public class Main {

	public static void main(String[] args) {

		Fighter f1= new Fighter("Ronaldo", 10, 120, 100,50); //değerler atandı
		Fighter f2= new Fighter("Messi", 20, 120, 100,50);
		
		Match match=new Match(f1, f2, 85, 100);   //maç fonksiyonunu çağırdık
		match.run();

	}

}
