package java8FrequentProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//java program to find all duplicate elements from a given string
public class Pracise1 {

	public static void main(String[] args) {
		String input="rabinlovejava";
		List<String> li=Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(s -> s.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
				
		
		System.out.println(li);

	}

}
