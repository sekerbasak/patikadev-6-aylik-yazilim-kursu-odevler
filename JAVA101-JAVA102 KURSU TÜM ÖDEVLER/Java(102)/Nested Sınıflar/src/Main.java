
public class Main {

	public static void main(String[] args) {
		//nested=> iç içe sınıflar
		//-inner class
		//-local class
		//ananymus class
		
		Out outClass=new Out();
		outClass.run();
		Out.In inClass=outClass.new In(); //mainden in calssına ulaşmak istersek
        inClass.Run();
	}

}
