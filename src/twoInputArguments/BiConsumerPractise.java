package twoInputArguments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class Employees{
	
	String name;
	double salary;
	
	Employees(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
}

public class BiConsumerPractise {

	public static void main(String[] args) {
		
		List<Employees> l=new ArrayList<>();
		populate(l);
		BiConsumer<Employees,Double> c=(e,d)-> e.salary=e.salary+d;
		for(Employees e:l) {
			c.accept(e,500.0);//salary increase by 500
		}
		for(Employees e:l) {
			System.out.println("employee name:"+ e.name);
			System.out.println("employee salary:"+ e.salary);
			System.out.println();
		}

	}
	public static void populate(List<Employees> l) {
		l.add(new Employees("rabin",1000));
		l.add(new Employees("sabin",4000));
		l.add(new Employees("nabin",5000));
		l.add(new Employees("kabin",2000));
	}


}
