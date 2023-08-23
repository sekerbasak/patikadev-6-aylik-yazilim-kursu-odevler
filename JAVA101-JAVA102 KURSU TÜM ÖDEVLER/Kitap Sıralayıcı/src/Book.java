
public class Book implements Comparable<Book> {

	


	private String bookName;
	private int pageNumber;
	private String authorNmae;
	private String publicationDate;
	
	
	
	public Book(String bookName,int pageNumber,  String authorNmae, String publicationDate) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.authorNmae = authorNmae;
		this.publicationDate = publicationDate;
	}

	
	
	public String getAuthorNmae() {
		return authorNmae;
	}


	public void setAuthorNmae(String authorNmae) {
		this.authorNmae = authorNmae;
	}


	public String getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}


	@Override
	public int compareTo(Book book) {
		return(this.getBookName().compareTo(book.getBookName()));
	}

	
}
