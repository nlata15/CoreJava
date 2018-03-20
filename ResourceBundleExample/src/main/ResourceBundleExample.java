package main;

import resources.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

	public final static String GREETINGS_PROPERTY_FILE = "resources/Messages";
	public final static String GREETINGS = "greeting" ;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle(GREETINGS_PROPERTY_FILE, Locale.US);
		System.out.println("Greetings in " + Locale.US +" " + bundle.getString(GREETINGS));
		
		Locale.setDefault(new Locale("in","IN"));
		bundle = ResourceBundle.getBundle(GREETINGS_PROPERTY_FILE);
		System.out.println("Greetings in " + Locale.getDefault() +" " + bundle.getString(GREETINGS));				

	}

}
