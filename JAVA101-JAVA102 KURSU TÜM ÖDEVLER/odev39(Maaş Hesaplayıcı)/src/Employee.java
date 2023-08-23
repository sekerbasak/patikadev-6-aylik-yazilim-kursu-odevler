
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee( String name,Double salary,int workHours,int hireYear) {
	
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
		
    public double tax() {
    	if (this.salary>1000) {
			return (this.salary*0.03);
		}
    	else {
			return 0;
		}
	
    	
	}
	
    public double bonus() {
    	if (this.workHours>40) {
			return((workHours-40)*30);
		}
    	else {
			return 0;
		}
		
   	}
    
    public double raiseSalary() {
    	int todayYear=2021;
    	if ((hireYear-2021)<10) {
    		return (this.salary*0.05);
		}
    	else if ((hireYear-2021)>9 &&(hireYear-2021)<20 ) {
    		return (this.salary*0.10);
		}
    	else if ((hireYear-2021)>19) {
    		return (this.salary*0.15);
		}
    	else {
			return 0;
		}
    	
		
    	
   	}
    public double calculateTotalSalary() {
        return this.salary + bonus() - tax() + raiseSalary();
    }
    
    public String toString() {
    	double totalSalary=calculateTotalSalary();
    	return "Adı: " + this.name + "\n" +
        "Maaşı: " + this.salary + "\n" +
        "Çalışma Saati: " + this.workHours + "\n" +
        "Başlangıç Yılı: " + this.hireYear + "\n" +
        "Vergi: " + tax() + "\n" +
        "Bonus: " + bonus() + "\n" +
        "Maaş Artışı: " + raiseSalary() + "\n" +
        "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n" +
        "Toplam Maaş: " + (totalSalary + bonus());
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
