import java.lang.Math;

class Sorting {
	public static void selectionSort(int[] arr) {
		int smallestIndex = 0;
		int tmp;
		// NOTE: -1 here is important so no extra swap at the end
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j; i < arr.length; i++) {
				if (arr[i] < arr[smallestIndex]) {
					smallestIndex = i;
				}
			}
			tmp = arr[smallestIndex];
			arr[smallestIndex] = arr[j];
			arr[j] = tmp;
		}
	}

	public static int[] merge(int[] L, int[] R) {
		int[] ret = new int[L.length + R.length];
		int retCount = 0;
		int i = 0;
		int j = 0;
		// Initial Sort
		while (i < L.length && j < R.length) {
			if (L[i] < R[j]) {
				ret[retCount] = L[i];
				retCount++;
				i++;
			} else {
				ret[retCount] = R[j];
				retCount++;
				j++;
			}
		}

		// only one of these loops will execute
		// this just adds the extra elements
		while (j < R.length) {
			ret[retCount] = R[j];
			retCount++;
			j++;
		}

		while (i < L.length) {
			ret[retCount] = L[i];
			retCount++;
			i++;
		}
		return ret;
	}

	public static int[] mergeSort(int[] arr) {
		// Base Case
		if (arr.length == 1) {
			return arr;
		}

		// Split array
		int[] L = new int[arr.length / 2];
		int[] R = new int[arr.length / 2 + (arr.length % 2)];
		for (int i = 0; i < arr.length / 2; i++) {
			L[i] = arr[i];
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			R[i - arr.length / 2] = arr[i];
		}

		return merge(mergeSort(L), mergeSort(R));
	}

	public static void quickSort(int[] arr, int startIndex, int endIndex) {
		if (endIndex <= startIndex) {
			return;
		}

		int pivotIndex = endIndex;
		int tmp;
		for (int i = startIndex; i < endIndex; i++) {
			if (arr[i] > arr[pivotIndex]) {
				tmp = arr[pivotIndex];
				arr[pivotIndex] = arr[i];
				arr[i] = tmp;
				pivotIndex = i;
			}
		}

		quickSort(arr, startIndex, pivotIndex);
		quickSort(arr, pivotIndex + 1, endIndex);
	}

	// NOTE: Only use int >= 0 in arr
	public static int[] binSort(int[] arr) {
		int biggest = 0;
		int smallest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > biggest) {
				biggest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		int[] B = new int[biggest - smallest + 1];
		for (int i = 0; i < B.length; i++) {
			B[i] = -1; // -1 denotes empty slot in arr
		}
		for (int i = 0; i < arr.length; i++) {
			B[arr[i]] = arr[i];
		}
		int[] ret = new int[arr.length];
		int j = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] != -1) {
				ret[j] = B[i];
				j++;
			}
		}

		return ret;
	}

	// NOTE: not sure if this is correct (it works though)
	public static int[] radixSort(int[] arr, int base) {
		// How many phases
		int steps = (int)Math.ceil(Math.log(arr.length) / Math.log(base));
		// Size of new array is base ^ phases
		int[] ret = new int[(int)Math.pow(base, steps)];
		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < steps + 1; i++) {
				// Finds the index in ret
				ret[arr[j] % (int)Math.pow(base, i)] = arr[j];
			}
		}
		return ret;
	}



	public static void main(String[] args) {
		int[] data = {5, 4, 3, 2, 1, 0};
		data = radixSort(data, 2);
		for (int elem : data) {
			System.out.println(elem);
		}
	}
}
