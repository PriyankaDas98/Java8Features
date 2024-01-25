package streamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedStream {
	public static void main(String[] args) {
		Stream<Integer> stream = IntStream.of(1,2,3,4).boxed();
		stream.forEach(System.out::println);
	}

}
