package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierImpl {
	public static void main(String[] args) {
		Supplier<String> supplier = ()->"Priyanka";
//		System.out.println(supplier.get());
		
//		In stream api if you don't find any value we can supply dummy data
//		using supplier interface
		
//		List<String> list = Arrays.asList("PD", "SS");
		List<String> list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}

}
