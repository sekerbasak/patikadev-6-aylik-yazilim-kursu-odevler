import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	//girilen şekilde çıktısı aynıdır
	//kendidni tekrar eden değerleri de tutar
		List<Integer> liste=new ArrayList<>();
		liste.add(10);
		liste.add(1);
		liste.add(0);
		liste.add(0);
		liste.add(45);
		liste.add(null);
		System.out.println(liste);
		System.out.println("Listenin boyutu: "+liste.size());
		System.out.println("Aranan deger: "+liste.indexOf(0));//kaçıncı indexte olduğunu bulur
		System.out.println("Listenin boyutu: "+liste.size());
		System.out.println(liste);
		liste.add(3, 11);
		System.out.println("Listenin boyutu: "+liste.size());
		System.out.println(liste);
		liste.set(3, null);
		System.out.println("-----------------------");
		Iterator<Integer> iterator=liste.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			
		}
		System.out.println("***************************");
		//bir listeyi diğer bir lsisteye aktarma:
		List<Integer> list2=new ArrayList<>();
		list2.addAll(liste);
		System.out.println(list2);
		System.out.println(liste.toString());
	}

}
