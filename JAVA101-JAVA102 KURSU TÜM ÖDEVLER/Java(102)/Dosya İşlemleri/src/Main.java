import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Main {

	public static void main(String[] args)  {
		
		//FileInputStream dosyadan byte byte okumayı sağlar!
		File dosya=new File("ornekDosya.txt");
		String dosyayaYazma="\n FileInputStream dosya okur, FileoutputStream dosyaya yazı yazar";
		try {
		//dosyaya veri yazma
			FileOutputStream outputStream=new FileOutputStream(dosya);// true parametresi eklenirse dosya silinmez, devamına yazılır.
			byte[] txtArray=dosyayaYazma.getBytes();
			outputStream.write(txtArray);
			
		//dosyadan veri okuma	
			FileInputStream input=new FileInputStream(dosya);
		    int i=input.read();
			while (i!=-1) {
				System.out.print((char)i);
				i=input.read();
			}
			input.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
