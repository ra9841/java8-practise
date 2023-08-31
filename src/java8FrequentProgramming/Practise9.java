package java8FrequentProgramming;


import java.util.List;
import java.util.stream.Collectors;

//Map()--It takes stream<T> as input and return stream<R>.It's mapper function produces single value for each input value.
//-hence it is also called one-to-one mapping.

// flatMap()-It takes stream<stream<T>> as input & return stream<R>.It's mapper function produces multiple value for each 
//-input value,hence it is also called one-to-one mapping.
public class Practise9 {

	public static void main(String[] args) {
		
		List<Customer>customer=DataBaseClass.getAll();
		
		 //List<Customer>  convert List<String> ------------------> Data Transformation
        //mapping : customer -----------------------------------------> customer.getEmail()
        //custom -> custom.getEmail() ----------------------------- one to one mapping
		List<String>str=customer.stream()
				.map(custom -> custom.getEmail())
				.collect(Collectors.toList());
		System.out.println(str);
		
		//#################################################
		
		//cust -> cust.getPhoneNumbers()  --------------------------->> one to many mapping
		List<List<String>>st=customer.stream()
									.map(cust -> cust.getPhoneNumber())
									.collect(Collectors.toList());
		System.out.println(st);
		
		//##################################################
		
		
		   //List<Customer>  convert List<String>---------------------------- -> Data Transformation
        //mapping : customer -----------------------------------------------------> phone Numbers
        //s -> s.getPhoneNumbers() --------------------------- ->> one to many mapping
		List<String>phoneNumber=customer.stream()
										.flatMap(s ->s.getPhoneNumber().stream())//data flattering
										.collect(Collectors.toList());
		System.out.println(phoneNumber);
		

	}

}
