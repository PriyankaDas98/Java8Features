package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStream {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i=1;i<=10;i++)
			nums.add(i);
		List<Integer> evenList = nums.stream().filter(
				i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(evenList);

	}

}
