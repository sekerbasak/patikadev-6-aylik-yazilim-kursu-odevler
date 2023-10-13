import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		
		try {
			//Buffered daha hızı veri okur ya da yazar
			FileInputStream fileinput=new FileInputStream("bufferedDosya.txt");
	BufferedInputStream buffinput=new BufferedInputStream(fileinput);		
		int i=buffinput.read();
		while (i!=-1) {
			System.out.println((char)i);
			i=buffinput.read();
		}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
