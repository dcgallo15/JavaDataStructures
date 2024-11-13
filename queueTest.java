// Circular Queue implementation in Java

class CQueue {
	int SIZE = 10; // Size of Circular Queue
	int front, rear;
	int items[] = new int[SIZE];

	CQueue() {
		front = -1;
		rear = -1;
	}

	// Check if the queue is full
	boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		}
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	// Check if the queue is empty
	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	// Adding an element
	void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % SIZE;
			items[rear] = element;
			System.out.println("Inserted " + element);
		}
	}

	// Removing an element
	int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = items[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} /* Q has only one element, so we reset the queue after deleting it. */
			else {
				front = (front + 1) % SIZE;
			}
			return (element);
		}
	}

	void display() {
		/* Function to display status of Circular Queue */
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Items -> ");
			for (i = front; i != rear; i = (i + 1) % SIZE)
				System.out.print(items[i] + " ");
			System.out.println(items[i]);
			System.out.println("Rear -> " + rear);
		}
	}
}


class CircularQueue {
	private final int maxSize = 10;
	private int[] array;
	private int front;
	private int end;
	CircularQueue(int elem) {
		array = new int[maxSize];
		front = 0;
		end = 1;
		array[front] = elem;
	}

	public void enqueue(int elem) {
		if (front + 1 == end) {
			System.out.println("Empty Innit");
		}
		array[end] = elem;
		end = (end + 1) % maxSize;
	}

	public int dequeue() {
		if (end == front) {
			System.out.println("Full Innit");
		}
		front = (front + 1) % maxSize;
		array[front] = 0; // FIXME
		return array[front];
	}

	// Dirty
	public int[] getArray() { return this.array; }
	public int getFront() {return this.front;}
	// NOTE: end is element after final
	public int getEnd() {return this.end;}
}


class queueTest {
	public static void main(String args[]) {
		CQueue queue = new CQueue();
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(1);
		queue.enQueue(1);
		queue.display();
	}
}
