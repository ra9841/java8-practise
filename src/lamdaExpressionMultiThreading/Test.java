package lamdaExpressionMultiThreading;
//whenever there is  functional interfacethen then we can happily use  lamda expression 
//runnable is interface
//lamda with multiThreading concept
public class Test {
	
	public static void main(String[] args) {
		Runnable r=()-> {
			for(int i=0;i<5;i++) {
				System.out.println("child thread-1");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread-1");
		}
	}
	//run number of time.output change 

}
