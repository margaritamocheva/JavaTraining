package setsAndMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ExerciseWithSets {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet<String>(); // contains only UNIQUE ELEMENTS !!!
		names.add("stela1");
		names.add("stela2");
		names.add("stela3");
		names.add("stela4");
		names.add("stela5");
		System.out.println(names.size());

		Set<Integer> nums = new HashSet<Integer>(); // POLYMORPHISM
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(4);
		System.out.println(nums.size());

	}

}
