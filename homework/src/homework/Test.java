package homework;

import java.util.Comparator;
import java.util.PriorityQueue;

class ReverseOrder implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		if (i1.equals(i2)) {
			return 0;
		}
		return i1 < i2 ? 1 : -1;
	}
}

public class Test {
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new ReverseOrder());
		minHeap.offer(4);
		minHeap.offer(6);
		minHeap.offer(5);
		minHeap.offer(3);
		minHeap.offer(1);
		while (!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}
}
