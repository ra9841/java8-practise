package java8FrequentProgramming;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//java program to find first non repeat element from a given string
public class Practise2 {

	public static void main(String[] args) {
		String input="rabinlovejava";
		
		String firstNonRepeatedValue=Arrays.stream(input.split(""))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream()
			.filter(s ->s.getValue()==1)
			.findFirst().get().getKey();
		System.out.println("1st non repeated value:"+ firstNonRepeatedValue);
				
		

	}

}
