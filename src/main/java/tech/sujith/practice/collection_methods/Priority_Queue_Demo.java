package tech.sujith.practice.collection_methods;

import java.util.PriorityQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import tech.sujith.practice.dto.Employee;

@Data
@AllArgsConstructor
class E {
	private int id;
	private int rank;
}

public class Priority_Queue_Demo {
	public static void main(String[] args) {
		PriorityQueue<E> q = new PriorityQueue<>((x, y) -> y.getRank() - x.getRank());
		q.offer(new E(1, 1));
		q.offer(new E(2, 1));
		q.offer(new E(3, 2));
		q.offer(new E(4, 8));
		q.offer(new E(5, 4));

		System.out.println(q.peek());
		


	}
}
