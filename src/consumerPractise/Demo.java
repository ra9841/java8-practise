package consumerPractise;

import java.util.function.Consumer;
//accept() method
public class Demo {

	public static void main(String[] args) {
		Consumer<String> c =s -> System.out.println(s);
		c.accept("rabin");
		c.accept("javaPractise");

	}

}
