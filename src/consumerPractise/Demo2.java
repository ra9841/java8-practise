package consumerPractise;

import java.util.function.Consumer;
import java.util.function.Function;

class Student{
	String name;
	int marks;
	
	Student(String name,int marks){//constructor
		this.name=name;
		this.marks=marks;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
	
		Function<Student,String> f=s -> {
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Destinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else grade="E[Failed]";
			return grade;
			
		};
		
		
		Consumer<Student> c=s1 ->{
			System.out.println("student name:" + s1.name);
			System.out.println("student marks:" + s1.marks);
			System.out.println("student grades:" + f.apply(s1));
			System.out.println();
		};
		
		
		Student[] s= { new Student("rabin",100),
						new Student("himal",65),
						new Student("keshav",55),
						new Student("himesh",45),
						new Student("aman",25)
		};
		for(Student s1:s) {
			c.accept(s1);
		}
	

	}

}
