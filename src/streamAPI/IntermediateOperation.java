package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		List<String> a = memberNames.stream().filter((s)-> s.startsWith("A")).map(
				(s)-> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(a);
		
		memberNames.stream().sorted().map(
				s->s.toUpperCase()).forEach(System.out::println);

	}

}
