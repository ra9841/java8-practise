package java8FrequentProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//java program to find all elements from array who starts with 1
public class Practise5 {

	public static void main(String[] args) {
		int[] numbers= {5,9,11,2,8,21,1,19,17,16,51,61};
		
		List<String> str=Arrays.stream(numbers)
				.boxed()
				.map(s ->s + "" )//change into string array
				.filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(str);

	}

}
