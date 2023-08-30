package java8FrequentProgramming;

import java.util.Arrays;
import java.util.List;

//String.join method example
public class Practise6 {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("1","2","3","4");
		
		String result=String.join("-", li);
		System.out.println(result);

	}

}
