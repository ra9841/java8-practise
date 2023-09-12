package java8FrequentProgramming;
//Syntax: object::methodName
//object------Reference to call that method
//methodName-----Method call
public class Test {
	
	public void m1() {
		System.out.println("m1() instance/non-static method");
	}
	
	public static void m2() {
		System.out.println("m2() static method");
	}

	public static void main(String[] args) {
		//reference::methodName
		//Test::m2();//--------static method reference //call with class name
		Test.m2();
		
		Test t=new Test();
		t.m1();
		//t::m1();//----instance method reference  //call with object/refrence name
		
		//constructor reference
		
		
		
		

	}

}
