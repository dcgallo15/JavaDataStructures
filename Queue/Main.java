class Main {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		try {
			queue.enqueue(0);
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.enqueue(0);
			queue.enqueue(0);
			queue.enqueue(0);
			queue.enqueue(0);
			queue.enqueue(0);
			queue.enqueue(1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		queue.printContents();
	}
}
