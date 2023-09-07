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
/*
Arrays.stream(input.split("")): It starts by splitting the input string (input) into an array of individual characters using the split("") method. This effectively converts the input string into a stream of characters.

.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())): This part of the code collects the characters into a Map where the characters are grouped by their identity (i.e., the character itself)
and counted. So, it creates a map where the keys are characters, and the values are the counts of how many times each character appears in the input string.

.entrySet().stream(): After grouping and counting the characters, it retrieves the set of key-value pairs (entries) from the map and converts it into a stream of Map.Entry objects. Each entry represents a character and its count.

.filter(s -> s.getValue() > 1): It filters the stream to only include entries where the count (the value of the entry) is greater than 1. This effectively removes characters that appear only once in the input string.

.map(Map.Entry::getKey): It maps each filtered entry back to its key (the character itself), effectively extracting the characters that appear more than once in the input string.

.collect(Collectors.toList()): Finally, it collects the filtered characters (those that appear more than once) into a List. This List will contain all the duplicate characters from the input string.
*/
