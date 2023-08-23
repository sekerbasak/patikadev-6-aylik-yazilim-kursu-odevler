
public class Main {

	
	
	static boolean isPalindrom(String str) {
		//System.out.println(str.charAt(2)); charAt() parametre olarak verilem indis değerini döndürür
		
		int i =0; //girilern kelimenin ilk indisi=0
		int j=str.length()-1;	//girilen keilmenin son indisi
		while (i<j) 
		{
		if (str.charAt(i)!=str.charAt(j))//indis değerleri eşit değilse palindrom değil
		{
			System.out.println("Sayi Palindrom Değildir!");
			return false;
		}	
			i++;
			j--;
		}
		System.out.println("Sayi Palindromdur!");//eşitse palindrom
		return true;
		
	}
	 //2.YOL
	static boolean isPalindrom2(String str) 
	{
		String reverse="";
		for (int i =str.length()-1; i <=0; i--) {
			reverse+=str.charAt(i);// tersine karakterin sondan dizilişini atadık
		}
		
		if (str.equals(reverse)) {
			return true;
		}
		else
		return false;
		
	}
	
	public static void main(String[] args) {
		isPalindrom("abba");
		isPalindrom2("yapay");

	}

}
