package setsAndMaps;

import java.util.HashMap;
import java.util.Map;


public class ExerciseWithMaps {

	public static void main(String[] args)
	{
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		phonebook.put("Pesho", 112);
		phonebook.put("Pesho1", 113);
		phonebook.put("Pesho2", 115);
		phonebook.put("Pesho5", 116);
		phonebook.put("Pesho3", 114);

		System.out.println("Name: Pesho3 ; Number: " + phonebook.get("Pesho3"));
		phonebook.put("Pesho3", 15565);
		System.out.println("Name: Pesho3 ; Number: " + phonebook.get("Pesho3") + "\n");



		for (Map.Entry<String, Integer> entry : phonebook.entrySet())
		{
			System.out.println("Name: " + entry.getKey() + " ; Number: " + entry.getValue());
		}
	}
}
