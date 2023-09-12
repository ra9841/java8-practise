package lamdaExpressionMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	
	private String name;
	private int age;
	
	Test2(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name +":"+ age;
	}

	public static void main(String[] args) {
		List<Test2>t=new ArrayList<>();
		t.add(new Test2("rabin",32));
		t.add(new Test2("sabin",35));
		t.add(new Test2("nabin",38));
		t.add(new Test2("kabin",25));
		t.add(new Test2("jabin",22));
		
		System.out.println(t);
		//compareTo for string
		List<Test2>t1=t.stream().sorted((x,y)->x.name.compareTo(y.name)) .collect(Collectors.toList());
		System.out.println(t1);

	}

}
