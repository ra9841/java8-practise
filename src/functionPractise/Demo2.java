package functionPractise;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=i -> 2*1;
		Function<Integer,Integer> f2=i -> i*i*i;
		Function<Integer,Integer> f3=i -> 10*i;
		
		System.out.println(f1.andThen(f2).apply(2)); //first f1 followed by f2
		System.out.println(f1.compose(f2).apply(2)); //first f2 and then f1
		System.out.println(f1.andThen(f2).andThen(f3).apply(2));

	}

}
