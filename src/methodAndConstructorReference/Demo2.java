package methodAndConstructorReference;
//constructor refernece
class Sample{//class
	Sample(){//constructor
		System.out.println("sample class constructor execution....");
	}
}

interface Interf{//interface
	public Sample get();//get() method refers Sample class constructor
}
public class Demo2 {//class

	public static void main(String[] args) {
		Interf i=Sample::new;
		Sample s1=i.get();//get() method refers Sample class constructor
		Sample s2=i.get();
		Sample s3=i.get();
		Sample s4=i.get();

	}

}
