package reflection.store.book;

import java.lang.reflect.Constructor;

//Create a new instance using the newInstance() of 'Constructor'
public class reflectionExample02 {

	public static void main(String[] args) {
		
		Class <?> c = null;
		Book newBook = null;
		
		try {
			c = Class.forName ("reflection.store.book.Book");
		} catch (Exception e) {
			System.out.println("ClassNot found exception throw:");
			e.printStackTrace();
		}
	
		
		Constructor <?> cons[] = c.getConstructors();
		
		try {
			newBook = (Book) cons[1]. newInstance ("Java Reflection","1.0","2014");
			// The parameterized constructor is invoked.
			
		} catch (Exception e) {
			System.out.println("Exception while creating new object:");
			e.printStackTrace();
		}
			newBook.print ();
			/*Output:
				Name: Java Reflection Version 1.0  Publisher:2014*/
			

	}

}
