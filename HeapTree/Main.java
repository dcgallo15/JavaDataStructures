class Main {
	public static int[] subList(int[] data, int startIndex, int endIndex) {
		int[] ret = new int[endIndex - startIndex];
		for (int i = startIndex; i < endIndex; i++) {
			ret[i - startIndex] = data[i];
		}
		return ret;
	}

// TODO: instead of copies with sublist use only indexes
	public static int[] heapSort(Heap heap) {
		int[] ret = new int[heap.getData().length];
		int i = 0;
		while (heap.getData().length > 0) {
			ret[i] = heap.getData()[0];
			heap = new Heap(subList(heap.getData(), 1, heap.getData().length));
			i++;
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] data = {2, 3, 5, 7, 9, 11, 10, 21};
		Heap heap = new Heap(data);
		heap.insert(31);
		heap.insert(33);
		heap.insert(34);
		heap.insert(35);
		heap.insert(36);
		heap.insert(37);
		heap.insert(38);
		heap.insert(39);
		for (int elem : heap.getData()) {
			System.out.println(elem);
		}
	}
}
