

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]  arrayStrings= {"a","b","guy"};
		Integer[] arrayintIntegers= {1,2,3,4,7};
		
        String str="hello";
        Integer number=null;
     	Nullable nullable1=new Nullable(str);
        
        Nullable<Integer> nullable=new Nullable<Integer>(10);
        nullable.run();
	
		
		nullable1.run();
		GenericMethods.printArray(arrayintIntegers);
		
	}

}
