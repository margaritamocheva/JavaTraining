package p1;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class TicketSystem {
	public static void main(String[] args) {
		ArrayDeque<Integer> tickets = new ArrayDeque<Integer>(10);
		tickets.offer(2);
		tickets.offer(87);
		tickets.offer(58);
		tickets.offer(25);
		tickets.offer(22);
		tickets.offer(18);
		tickets.offer(98);
		tickets.offer(23);
		tickets.offer(29);
		tickets.offer(38);




		Scanner sc=new Scanner(System.in);
		System.out.println("If you want a ticket type \"give\" and if you don't want ticket type \"end\" ");
		String comand;
		comand=sc.next();
		while(tickets.peek()!=null) {
		if(comand=="give") {
			System.out.println(tickets.poll());

		}


	}
		}
}
