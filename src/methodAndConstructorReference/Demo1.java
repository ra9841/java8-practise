package methodAndConstructorReference;
//method reference    //having no static method
public class Demo1 {

	public  void m1() {  
		for(int i=0;i<5;i++) {
		System.out.println("child thread-1");
		}
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		//runnable in interface
		Runnable r=d::m1;//refer method reference. 
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread-1");
		}
	}
}
