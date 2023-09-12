package supplierPractise;

import java.util.Date;
import java.util.function.Supplier;
//get() method
public class Demo {

	public static void main(String[] args) {
		 Supplier<Date> s= ()-> new Date();
		 System.out.println(s.get());
		 
		 
		 
	

	}

}
