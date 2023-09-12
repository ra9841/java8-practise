package functionPractise;

import java.util.function.Function;
//apply() method
public class Demo {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i ->i*i;//input integer output integer
		System.out.println(f.apply(4));
		System.out.println(f.apply(10));
		System.out.println(f.apply(5));
		System.out.println(f.apply(8));
		
		Function<String,Integer> f1=i ->i.length();//input string output integer
		System.out.println(f1.apply("rabinlovejava"));
		System.out.println(f1.apply("mynameis rabin"));
		
		Function<String,String> f2=i ->i.toUpperCase();//input string output string
		System.out.println(f2.apply("rabinlovejava"));
		System.out.println(f2.apply("mynameis rabin"));

	}

}
