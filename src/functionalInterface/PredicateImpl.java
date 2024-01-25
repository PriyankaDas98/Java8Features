package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {
	public static void main(String[] args) {
//		Predicate<Integer> predicate = val -> val % 2==0;
//		System.out.println(predicate.test(12));
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(val -> val % 2==0).forEach(t -> System.out.println("Printing : "+t));
	}
	

}
