package consumerPractise;

import java.util.function.Consumer;

class Movie{
	String name;
	Movie(String name){
		this.name=name;
		
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		Consumer<Movie> c1=m -> System.out.println(m.name+ " ready to release");
		Consumer<Movie> c2=m -> System.out.println(m.name+ "released but it is bigger hit");
		Consumer<Movie> c3=m -> System.out.println(m.name+ "storing inforamtion data");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);//printing all  //consumer chaining
		
		Movie m=new Movie("jawan");
				//c1.accept(m);
		cc.accept(m);

	}

}
