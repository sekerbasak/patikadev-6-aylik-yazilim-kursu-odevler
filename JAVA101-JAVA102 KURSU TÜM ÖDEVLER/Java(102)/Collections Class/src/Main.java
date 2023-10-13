import java.security.PublicKey;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {


		/*
		 * 
		 * 
		 * 
		 * Set interface (Arayüzü)


       -Collection interface’den kalıtım almıştır.
       !-Aynı elemanların veri kümesi içinde tekrar bulunmasına izin vermez. 
       -HashSet sınıfı en yaygın olan alt sınıfıdır
       -Eleman tekrarının olmamasını sağlayabilmek için veri kümesi içindeki nesnelerin “equals” ve “hashCode” fonksiyonlarının tanımlı olması gerekir.


    !!saklama mantığı hashleme olduğu için aynı değerler aynı çıkışı verir bu yüzden aynı değerler tekrar tekrar yazılmaz
     
    !!saklama mantığı hashleme olduğu için yine çıkış değerleri fonksiyonun çıkış değerine eşit olur bu da rastgele dizilime sebebiyet verir
     
        
        Set interface’in alt sınıfları:

           # HashSet
 

          # LinkedHashSet


          # TreeSet

		 * */
		
		
		
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(12);
		hashSet.add(12);
		hashSet.add(12);
		hashSet.add(12);
		hashSet.add(30);
		hashSet.add(1);
		hashSet.add(123);
		hashSet.add(123);
		hashSet.add(null);
		Iterator<Integer> itr=hashSet.iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("HashSet boyutu: "+hashSet.size());
		System.out.println("30 numarayı sil: "+hashSet.remove(30));
		System.out.println("123 sayısı hashSette var mı? "+hashSet.contains(123));
		for (Integer i : hashSet) {
			System.out.println(i);
		}
		
		
		//LINKEDHASHET
		//ne girdiysen aynı şekilde çıktı veriri. Hashsetlerden farkı budur
		System.out.println("-------------------------------------------------");
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		linkedHashSet.add(30);
		linkedHashSet.add(20);
		
		Iterator<Integer>iterator=linkedHashSet.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
			
		}
		
		System.out.println("----------------------------------------------------");
		//TREESET => sıralamayı istediğin gibi yapabiliyrosun.
		TreeSet<Student> students=new TreeSet<>();
	students.add(new Student("mustafa", 20));
	students.add(new Student("eren", 60));
	students.add(new Student("asli", 90));
	students.add(new Student("havva", 87));
	students.add(new Student("havva", 87));
	
	for (Student s : students) {
		System.out.println(s.getName());
	}
	}
	

	
	
	
	
	
	
	public static class Student implements Comparable<Student> {
		private String name;
		private int note;
		
		  public String getName() {
			return name;
		}
		 
		  @Override
		    public int compareTo(Student other) {
		        // Burada öğrencileri notlarına göre sıralıyoruz.
		        // Eğer başka bir kriterle sıralamak istiyorsanız, ona göre düzenleme yapın.
		        return Integer.compare(this.note, other.note);
		    }
		
		public Student(String name, int note) {
			super();
			this.name = name;
			this.note = note;
		}



		public void setName(String name) {
			this.name = name;
		}
		public int getNote() {
			return note;
		}
		public void setNote(int note) {
			this.note = note;
		}
	
		
	}

	
	
	
	
	
	
	
	
	
	
}
