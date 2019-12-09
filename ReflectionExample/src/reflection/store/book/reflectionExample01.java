package reflection.store.book;

//Create a new instance using the newInstance() of 'Class'

public class reflectionExample01 {
	
	public static void main(String args[]) {
		
		Class <?> c = null;
		Book newBook = null;
		String name = null;
		String version = null;
		
		try {
			c = Class.forName ("reflection.store.book.Book");
			// The above line throws "ClassNotFoundException"
		} catch (Exception e) {
			System.out.println("ClassNotFoundException thrown when loading Book class");
			e.printStackTrace();
		}
		
		try {	
			newBook = (Book) c.newInstance ();
			//default constructor is invoked.
			
			// The above line may throw InstantiationException/ IllegalAccessException
		} catch (Exception e) {
			System.out.println("InstantiationException/ IllegalAccessException");
			e.printStackTrace();
		}
	
		
		name = "Java Reflection";
		version = "1.0";
		
		newBook.setYearOfPublish ("2014"); 
		newBook.print();
		/*Output:
		Name: null Version null  Publisher:2014*/
	}

}
