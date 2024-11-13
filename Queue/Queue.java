import java.lang.Exception; // For exceptions

// Circular Queue of Integers
class Queue {
	private int[] data;
	private int front; // index of first element
	private int back; // index of last element
	private int size;

	public Queue(int size) {
		this.size = size;
		data = new int[this.size];
		this.front = 0;
		this.back = 0;
	}

	// Confusion here since not sure how to differentiate if queue is full or empty?
	public boolean isEmpty() {
		if (back == front) {
			return true;
		}
		return false;
	}

	// TODO: Fix
	public boolean isFull() {
		if (front >= back) {
			return true;
		}
		return false;
	}

	// Adds Element to end of queue
	public void enqueue(int elem) throws Exception {
		if (this.isFull() == true) {
			throw new Exception("FullQueue");
		}
		data[(back % size)] = elem;
		back = back + 1;
		System.out.print("Back: ");
		System.out.println(back);
	}

	// Removes element from front of queue and returns it
	public int dequeue() throws Exception {
		if (this.isEmpty() == true) {
			throw new Exception("Empty Queue");
		}
		System.out.print("Front: ");
		System.out.println(front + 1);
		front = front + 1;
		return data[front % size];
	}

	// Prints all elements in queue (for testing)
	public void printContents() {
		for (int i = front; i < back; ++i) {
			System.out.println(data[i % size]);
		}
	}
}
