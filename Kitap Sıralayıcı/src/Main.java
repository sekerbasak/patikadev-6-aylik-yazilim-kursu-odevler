
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 TreeSet<Book> booksSortedByName  = new TreeSet<>(); 

        //5 tane kitap nesnesi oluştuduk ve treeSet listemize ekledik
		 booksSortedByName .add(new Book("Semerkant",430,"Amin Maulouf", "10/10/2013"));
		 booksSortedByName .add(new Book("Cemile",120,"Cengiz Aytmatov", "15/10/2012"));
		 booksSortedByName .add(new Book("Suc ve Ceza",512,"Dostoyevski", "10/10/2014"));
		 booksSortedByName .add(new Book("Hafizin yolculugu",80,"Joseph", "10/10/2015"));
		 booksSortedByName .add(new Book("Efsuncu Baba",83,"Huseyin Rahmi Gurpinar", "10/10/2018"));
		
		 
		 //kitapları önce adıyla sıraladık
		System.out.println("\t Kitaptaki kitaplar isim sirasina göre listeleniyor: \n ");
		for (Book book : booksSortedByName ) {
			System.out.println(book.getBookName());
		}
		System.out.println("-------------------------------------");

		System.out.println("\t Kitaptaki kitaplar sayfa sirasina göre listeleniyor: \n");
		
		TreeSet<Book> booksSortedByPageNumber= new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				
				return o1.getPageNumber()-o2.getPageNumber();
			}
			
		});
		//5 tane kitap nesnesi oluştuduk ve treeSet listemize ekledik
		booksSortedByPageNumber .add(new Book("Semerkant",430,"Amin Maulouf", "10/10/2013"));
		booksSortedByPageNumber .add(new Book("Cemile",120,"Cengiz Aytmatov", "15/10/2012"));
		booksSortedByPageNumber .add(new Book("Suc ve Ceza",512,"Dostoyevski", "10/10/2014"));
		booksSortedByPageNumber .add(new Book("Hafizin yolculugu",80,"Joseph", "10/10/2015"));
		booksSortedByPageNumber .add(new Book("Efsuncu Baba",83,"Huseyin Rahmi Gurpinar", "10/10/2018"));
		
		
		//kitapları sayfa sayısına göre sıraladık
		for (Book book : booksSortedByPageNumber) {
			System.out.println("Sayfa Sayisi: "+book.getPageNumber()+" Kitabin adi: "+book.getBookName()+"\n");
		}
		
	}

}
