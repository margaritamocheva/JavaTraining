package p1;

import java.util.ArrayDeque;

public class TicketSystem {
	public static void main(String[] args) {
		ArrayDeque<Integer> tickets = new ArrayDeque<Integer>();
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
	}
}
