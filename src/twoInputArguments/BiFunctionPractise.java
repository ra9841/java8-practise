package twoInputArguments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
}
public class BiFunctionPractise {

	public static void main(String[] args) {
		
		List<Employee> l=new ArrayList<>();
		//integer & string input type and employee is return type
		BiFunction<Integer,String,Employee> f=(eno,name)-> new Employee(eno,name);
		
		l.add(f.apply(100,"rabin"));
		l.add(f.apply(200,"nabin"));
		l.add(f.apply(500,"sabin"));
		l.add(f.apply(300,"kabin"));
		l.add(f.apply(500,"jabin"));
		
		for(Employee e:l) {
			System.out.println("employee number:"+ e.eno);
			System.out.println("employee name:"+ e.name);
			System.out.println();
		}
		
		

	}

}
