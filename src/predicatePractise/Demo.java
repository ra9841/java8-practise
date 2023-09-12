package predicatePractise;

import java.util.function.Predicate;
//test() method
public class Demo {

	public static void main(String[] args) {
		int[] x= {0,5,10,15,23,45,20,30,44,50,60,44,28};
		Predicate<Integer> p1=i -> i%2==0;
		Predicate<Integer>p2=i -> i>10;
		System.out.println("The number which are even and/or greater than 10 are:");
		
		for(int j:x) {
			//if(p1.and(p2).test(j)) {
			if(p1.or(p2).test(j)) {
				System.out.println(j);
			}
			
		}

	}

}
