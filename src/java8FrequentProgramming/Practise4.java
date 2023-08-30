package java8FrequentProgramming;

import java.util.Arrays;

//java program to find longest string from given array
public class Practise4 {

	public static void main(String[] args) {
		String [] strArray= {"java","rabin","springboot","microservices"};
		
		String longestString=Arrays.stream(strArray)
				.reduce((x,y) -> x.length()>y.length()?x:y)
				.get();
		System.out.println(longestString);

	}

}
