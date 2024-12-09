package entity;

public class BookStore {
	private String ISBN;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	private String title;
	private String author;
	private String category;
	private Integer year;
	private Byte edition;
	private Double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public BookStore(String iSBN, String title, String author, String category, Integer year, Byte edition,
			Double price) {
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.category = category;
		this.year = year;
		this.edition = edition;
		this.price = price;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Byte getEdition() {
		return edition;
	}
	public void setEdition(Byte edition) {
		this.edition = edition;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
