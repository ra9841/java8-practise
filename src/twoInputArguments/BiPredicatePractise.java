package twoInputArguments;

import java.util.function.BiPredicate;
//two input argument predicate
public class BiPredicatePractise {

	public static void main(String[] args) {
		//two input argument
		BiPredicate<Integer,Integer> p=(a,b)-> (a+b)%2==0;
		System.out.println(p.test(10,20));
		System.out.println(p.test(15,20));

	}

}
