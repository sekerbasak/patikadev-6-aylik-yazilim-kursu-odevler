
public class Course {

	
	 private String courseName;
	 private String code;
	 private Instructor instructor;
	 
	public Course(String courseName, String code,Instructor instructor) {
		super();
		this.courseName = courseName;
		this.code = code;
		this.instructor=instructor;
	}
	

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor=instructor;
	}

	 //DEPENDENCY BAĞINTISI => bir sınıfın metodu diğer bir sınıdfı parametre olarak kullanıyorsa oluşur
	public double calcAvarage(Student[] students)//course uses students thats why course class depends to student
	{
		double avarage=0;
		for (int i = 0; i < students.length; i++) {
		//	System.out.println(students[i]);
			avarage +=students[i].getNote();
		}
		
		return avarage/students.length;
	}
}
