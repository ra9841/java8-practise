package lamdaExpressionMultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//lamda in collection
public class Test1 {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(12);
		l.add(22);
		l.add(33);
		l.add(32);
		l.add(43);
		System.out.println(l);
		Collections.sort(l);
	
		
		List<Integer>li=l.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(li);
		
	

	}

}
