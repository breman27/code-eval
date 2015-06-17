public class SortAlgorithms {
	private int[] array;
	private int[] tempMergeArray;
	private int length;
	private static int[] A;

	public static void main(String[] args) {
		A = new int[4];
		recBitstring(A.length);
	}

	public static void recBitstring(int n){
		int count = 0;
		if(n == 0){
			for(int i : A){
				count++;
				System.out.print(i);
				if(count % A.length == 0){
					System.out.println();
				}
			}
		}
		else{
			A[n-1] = 0;
			recBitstring(n-1);
			A[n-1] = 1;
			recBitstring(n-1);
		}
	}
	
	public void sort(int[] array, String sortType) {
		if (array == null || array.length == 0) {
			return;
		}
		this.array = array;
		this.length = array.length;
		switch (sortType) {
		case "quick":
			quickSort(0, length - 1);
			break;
		case "merge":
			this.tempMergeArray = new int[length];
			mergeSort(0, length - 1);
			break;
		case "insertion":
			insertionSort(array);
			break;
		}
	}

	/*
	 * Divide and Conquer algorithm, relies on partition operation. Average: O(n
	 * log n) Worst: O(n^2)
	 * 
	 * Params: array: array to sort low: Start element high: End element
	 * (inclusive)
	 */
	private void quickSort(int low, int high) {
		int i = low;
		int k = high;
		int pivot = array[low + (high - low) / 2];

		while (i <= k) {
			// Stops when element on left side is greater than the pivot
			while (array[i] < pivot) {
				i++;
			}
			// Stops when the element on the right side is less than the pivot
			while (array[k] > pivot) {
				k--;
			}
			// Swap the left and right elements, since the one on the left is
			// greater than the one on the right (proved via pivot)
			if (i <= k) {
				exchangeNums(i, k);
				// Move on to the next elements
				i++;
				k--;
			}
		}
		// Recursive calls
		if (low < k) {
			quickSort(low, k);
		}
		if (i < high) {
			quickSort(i, high);
		}
	}

	private void exchangeNums(int i, int k) {
		int temp = array[i];
		array[i] = array[k];
		array[k] = temp;
	}

	/*
	 * Guaranteed O(n * log(n)) efficiency
	 */
	private void mergeSort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			mergeParts(low, middle, high);
		}
	}

	private void mergeParts(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			tempMergeArray[i] = array[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}

	private void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
	}
	
	private void selectionSort(int[] array){
		int i, j, first, temp;
		for(i = array.length-1; i > 0; i--){
			
		}
	}
}
