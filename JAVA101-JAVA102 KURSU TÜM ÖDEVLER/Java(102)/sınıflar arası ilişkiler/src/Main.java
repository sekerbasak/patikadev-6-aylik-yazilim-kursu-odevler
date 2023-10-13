

public class Main {

	public static void main(String[] args) {
		Student std1= new Student("mustafa", "çetindağ", "1234", "İstanbul", 60);
		Student std2= new Student("arzu", "çetindağ", "14", "Amsterdam", 120);
	 
	    //	std1.setSurname("alemdağ");
	   //  System.out.println(std1.getSurname()); 
		
		//COMPOSITION=>eğer bir sınıfın değişkenlerinden en az bir tanesi başka bir sınıf türünden ise,
	    Instructor teacher=new Instructor("Fatih", "Adak", "veri yapıları");
	    Instructor teacher2=new Instructor("edc", "dfg", "ders");
		Course course1=new Course("math", "3",teacher);
		System.out.println(course1.getInstructor().getDepartment());
		course1.setInstructor(teacher2);
		System.out.println(course1.getInstructor().getName());
		
		 //DEPENDENCY BAĞINTISI => bir sınıfın metodu diğer bir sınıdfı parametre olarak kullanıyorsa oluşur
		Student[] std= {std1,std2};
	//	System.out.println("Ortalama: "+course1.calcAvarage(std)) ;
	
	   
	
	}

}
 