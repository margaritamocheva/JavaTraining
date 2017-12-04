package stacksAndQueues;

import java.util.ArrayDeque;

public class ExerciseWithStacks
{

	public static void main(String[] args)
	{
		ArrayDeque<String> names = new ArrayDeque<String>();
		names.push("Stela"); // push is used to add items in the stack
		names.push("Stela1");
		System.out.println(names.peek()); // shows last element without removing it
		System.out.println(names.peek());
		names.push("Stela2");
		System.out.println(names.pop()); // removes last element
		System.out.println(names.peek());
		names.push("Stela3");
		names.push("Stela4");
		names.push("Stela5");


	}
}
