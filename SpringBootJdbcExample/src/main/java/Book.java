
public class Book {
    private int id;
    private String title;
    private String author;
    private float price;
 
    protected Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    protected Book() {
    }
 
 
    @Override
    public String toString() {
        return "Book [" + title + ", " + author + ", $" + price + "]";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
    // getters and setters...
}
