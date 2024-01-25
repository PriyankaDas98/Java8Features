package streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class StreamCreation {
	public static void main(String[] args) {
		// creating streams
		//1. 
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6);
		stream1.forEach(System.out::println);
		
		// 2.
		Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5,6});
		stream2.forEach(System.out::println);
		
		// 3.
		List<Integer> list = new ArrayList();
		for(int i = 1; i<= 10; i++){
		      list.add(i);
		}
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		//4
		IntStream stream4 = "abc12_@357".chars();
		stream4.forEach((p)->System.out.println(p));
		
		Stream<String> stream = Stream.of("A$B$C".split("\\$"));
		stream.forEach(p -> System.out.println(p));
		
	}
	
}
