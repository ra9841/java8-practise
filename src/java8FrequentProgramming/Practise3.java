package java8FrequentProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//java program to find second highest number from given array
public class Practise3 {

	public static void main(String[] args) {
		int[] numbers = { 5, 9, 11, 23, 4, 54 };

		//List<Integer> li 
			Integer li= Arrays.stream(numbers).boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get();
				//.collect(Collectors.toList());
		System.out.println(li);

	}

}
