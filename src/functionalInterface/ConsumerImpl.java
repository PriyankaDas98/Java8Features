package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
	public static void main(String[] args) {
//		Consumer<String> consumer = str -> System.out.println("Printing : "+str);
//		consumer.accept("10");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.forEach(t -> System.out.println("Printing : "+t*2));
	}
	

}
