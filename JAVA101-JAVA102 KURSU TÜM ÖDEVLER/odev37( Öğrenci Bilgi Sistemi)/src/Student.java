
public class Student {
	    String name,stuNo;
	    int classes;
	    Course mat;            //nesneye ait nitelikler tanımlanıyor
	    Course fizik;
	    Course kimya;
	    double avarage;
	    boolean isPass;

	    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) //yapıcı metotla değerler atanıyor
	    {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.mat = mat;
	        this.fizik = fizik;
	        this.kimya = kimya;
	        calcAvarage();
	        this.isPass = false;
	    }
	    
	    public void addBulkExamNote(int mat, int fizik, int kimya) //değerler 0-100 arasındaysa atama işlemi yapılıyor
	    {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }

	    }
	    
	    public void isPass() 
	    {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
	            System.out.println("Notlar tam olarak girilmemiş");
	        } else {
	            this.isPass = isCheckPass(); //true gelirse geçti. ekrana bilgilendirici çıktı verildi
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("Sınıfı Geçti. ");
	            } else {
	                System.out.println("Sınıfta Kaldı.");
	            }
	        }
	    }

	    public void calcAvarage() //ortalama hesaplanıyor. sözlü değerin ağırlıklı ortalaması da hesaba katıldı
	    {
	    	 double verbalAverage = (this.mat.note * this.mat.verbalWeight +
                     this.fizik.note * this.fizik.verbalWeight +
                     this.kimya.note * this.kimya.verbalWeight) / 3;
this.avarage = (this.mat.note + this.fizik.note + this.kimya.note + verbalAverage) / 4;  }

	    public boolean isCheckPass() //ortalama 55in üstündeyse geçti 
	    {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote()//değerleri ekrana yazdıran metot
	    {
	        System.out.println("=========================");
	        System.out.println("Öğrenci : " + this.name);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	    }

	}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

