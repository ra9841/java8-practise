package java8FrequentProgramming;

import java.util.stream.IntStream;

//Skip & limit method use case based example
public class Practise7 {

	public static void main(String[] args) {
		IntStream.range(1,10)
				.skip(1)
				.limit(8)
				.forEach(System.out::println);

	}

}
