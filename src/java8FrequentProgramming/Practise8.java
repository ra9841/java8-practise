package java8FrequentProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//skip() & limit()
public class Practise8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> num=numbers.stream()
								.skip(1)
								.limit(7)
								.collect(Collectors.toList());
		System.out.println(num);
	}
	


}
