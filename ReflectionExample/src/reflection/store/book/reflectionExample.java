package reflection.store.book;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class reflectionExample {

	public static void main(String[] args) throws Exception {
		
		Book sampleBook = new Book("Java Reflection", "1.0", "2014");
		
		System.out.println(sampleBook.getClass().getName());
		// output -  reflection.store.book.Book
		
		Field [] pbFields = Class.forName ("reflection.store.book.Book"). getFields ();
		System.out.println (Arrays.toString (pbFields));
		/* Output:
		 * [public java.lang.String reflection.store.book.Book.name,
		 * public java.lang.String reflection.store.book.Book.version]
		 */
		
		Method [] pbMethods = Class. forName ("reflection.store.book.Book"). getMethods ();
		System.out.println (Arrays.toString (pbMethods));
		/*Output:
		[public void reflection.store.book.Book.print(), 
		 public void reflection.store.book.Book.setYearOfPublish(java.lang.String), 
		 public java.lang.String reflection.store.book.Book.getYearOfPublish(), 
		 public final void java.lang.Object.wait() throws java.lang.InterruptedException, 
		 public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, 
		 public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, 
		 public boolean java.lang.Object.equals(java.lang.Object), 
		 public java.lang.String java.lang.Object.toString(), 
		 public native int java.lang.Object.hashCode(), 
		 public final native java.lang.Class java.lang.Object.getClass(), 
		 public final native void java.lang.Object.notify(), 
		 public final native void java.lang.Object.notifyAll()]*/
		
		Constructor<?> [] pbConstructors = Class. forName ("reflection.store.book.Book"). getConstructors ();
		System.out.println (Arrays.toString (pbConstructors));
		/*Output:
		[public reflection.store.book.Book(), 
		 public reflection.store.book.Book(java.lang.String,java.lang.String,java.lang.String)]*/
	
	}
}
