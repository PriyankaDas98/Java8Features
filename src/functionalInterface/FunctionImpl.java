package functionalInterface;

import java.util.function.Function;

public class FunctionImpl {

	public static void main(String[] args) {
		// it takes first argument as a parameter and second
		// as return type
		Function<Integer, String> value = (t)-> t +" multiply by"
				+ " 100 is "+ t*100;
		System.out.println(value.apply(5));

	}

}
