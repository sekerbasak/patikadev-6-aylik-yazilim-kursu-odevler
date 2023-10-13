import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		

        Car c1=new Car("Audi","A3");
        
        try {
        	FileOutputStream outputFile=new FileOutputStream("araba.txt");
        	String file="araba.txt";
        	ObjectOutputStream output=new ObjectOutputStream(outputFile);
			output.writeObject(c1);
        	
			FileInputStream inputFile=new FileInputStream(file);
			ObjectInputStream inputStream=new ObjectInputStream(inputFile);
			Car newCar=(Car)inputStream.readObject();
			System.out.println(newCar.getBrand());
			System.out.println(newCar.getModel());
        	output.close();
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
