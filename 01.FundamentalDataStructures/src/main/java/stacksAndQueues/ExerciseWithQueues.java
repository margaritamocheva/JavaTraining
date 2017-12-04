package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ExerciseWithQueues
{

	public static void main(String[] args)
	{
		ArrayDeque<String> names = new ArrayDeque<String>();

		names.offer("stela1");
		names.offer("stela2");
		names.offer("stela3");
		names.offer("stela4");
		System.out.println(names.pop());
		System.out.println(names.peek());
		
	}
}
