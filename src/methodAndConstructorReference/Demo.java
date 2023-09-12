package methodAndConstructorReference;
//method reference    //having static method
public class Demo {
	
	public static void m1() {  //static method
		for(int i=0;i<5;i++) {
		System.out.println("child thread-1");
		}
	}

	public static void main(String[] args) {
		//runnable in interface
		Runnable r=Demo::m1;//refer method reference. no argument so no ()
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread-1");
		}
	}

}
