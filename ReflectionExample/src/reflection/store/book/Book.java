package reflection.store.book;

public class Book {
	public String name;
	public String version;
	private String yearOfPublish;

	public Book() {
	}

	public Book(String name, String version, String yearOfPublish) {
		this.name = name;
		this.version = version;
		this.yearOfPublish = yearOfPublish;
	}

	public void setYearOfPublish(String yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public String getYearOfPublish() {
		return this.yearOfPublish;
	}

	public void print() {
		System.out.println("Name: " + this.name + " Version " + this.version);
	}

	private void privatePrint() {

		System.out.println("Name: " + this.name + " Version " + this.version + " Published in " + this.yearOfPublish);

	}
}