package reflection.store.book;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Java Reflection for public/private fields & public/private methods
public class reflectionExample03 {

	public static void main(String[] args) {
		try {
			//get & set public fields
			System.out.println("*Accessing/Resetting public fields:*");
			Field field = Class.forName ("reflection.store.book.Book").getField ("version");
			
			Book sampleBook0 = new Book ("Java Reflection", "1.0", "2014");
			System.out.println (field.get (sampleBook0)); //prints 1.0
			
			field.set (sampleBook0, "1.1");
			System.out.println (field.get (sampleBook0) + "\n"); //prints 1.
	
			//get & set private fields
			System.out.println("*Accessing private fields*");
			Field privateField = Class.forName ("reflection.store.book.Book").getDeclaredField ("yearOfPublish"); 
			privateField.setAccessible (true); 
			
			Book sampleBook1 = new Book ("Java Reflection", "1.0", "2014");
			System.out.println (privateField.get (sampleBook1)); //prints 2014
			
			privateField.set (sampleBook1, "2013");
			System.out.println (privateField.get (sampleBook1) + "\n"); //prints 2013
			
			//public methods
			System.out.println("*Accessing public methods*");
			Method method;
			Book sampleBook2 = new Book ("Java Reflection", "1.0", "2014");
			method = sampleBook2.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(sampleBook2);
			System.out.println();
			
			//private methods
			System.out.println("*Accessing private methods*");
			Method method0;
			Book sampleBook3 = new Book ("Java Reflection", "1.0", "2014");
			method = sampleBook3.getClass().getDeclaredMethod ("privatePrint", new Class<?>[0]);
			method.setAccessible (true);
			method.invoke (sampleBook3);
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Exception:");
			e.printStackTrace();
		}
	}

}
