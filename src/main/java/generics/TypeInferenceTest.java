package generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TypeInferenceTest {

	public static void main(String[] args) {

		String[] words = { "Hello", "Hi" };

		Set<String> set = new HashSet<>();
		set.addAll(Arrays.asList(words));
		
		addElement(set);
	}

	private static void addElement(Set<? super String> set) {
		set.add("a");
		System.out.println(set);
	}
}
