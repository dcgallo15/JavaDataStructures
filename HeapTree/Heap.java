class Heap {
	private int[] data;
	public Heap(int[] arr) {
		data = arr;
		heapify();
	}

	// index is root of subtree to bubbleUp
	private void bubbleUp(int index) {
		int tmp;
		// Check left child exists
		if (2 * index + 1 < data.length) {
			// if left child > parent
			if (data[2 * index + 1] > data[index]) {
				// swap left child and parent
				tmp = data[index];
				data[index] = data[2 * index + 1];
				data[2 * index + 1] = tmp;
				// If there is a swap
				// Call again on parent node if parent node exists
				if (((index - 1) / 2) + 1 > 0) {
					bubbleUp((index - 1) / 2);
				}
			}
		}
		// Check right child exists
		if (2 * index + 2 < data.length) {
			// if right child > parent
			if (data[2 * index + 2] > data[index]) {
				// swap right child and parent
				tmp = data[index];
				data[index] = data[2 * index + 2];
				data[2 * index + 2] = tmp;
				// If there is a swap
				// Call again on parent node if parent node exists
				if (((index - 2) / 2) + 1 > 0) {
					bubbleUp((index - 2) / 2);
				}
			}

		}
		return;
	}

	public void heapify() {
		for (int i = 0; i < data.length / 2 + 1; i++) {
			bubbleUp(i);
		}
	}

	public void insert(int elem) {
		int[] newArr = new int[data.length + 1];
		System.arraycopy(data, 0, newArr, 0, data.length);
		newArr[newArr.length - 1] = elem;
		data = newArr;
		bubbleUp((newArr.length - 2) / 2);
		bubbleUp((newArr.length - 3) / 2);
	}

	public int[] getData() { return data; }
}
