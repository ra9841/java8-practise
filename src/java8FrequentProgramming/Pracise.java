package java8FrequentProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//java program to count the occurance of each character in a string
public class Pracise {

	public static void main(String[] args) {
		String input="rabinlovejava";
		//String[] results=input.split("");
		//System.out.println(Arrays.toString(results));
		
		Map<String,List<String>> map=Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(s -> s));
		
		System.out.println(map);
		
		//#####################################################
		
		Map<String,Long> map1=Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map1);

	}

}
