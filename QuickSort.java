package algorithms;
public class QuickSort {

	  /**
	   *Time complexity: Average case - O(n log n) | Worst case - O(n2)
	   */
	  public int[] sort(int[] arr) {
	    return quickSort(0, arr.length - 1, arr);
	  }

	  private int[] quickSort(int low, int high, int[] arr) {
	    if (low < high) {
	      int pivot = partition(low, high, arr);
	      quickSort(low, pivot - 1, arr);
	      quickSort(pivot + 1, high, arr);
	    }
	    return arr;
	  }

	  private int partition(int low, int high, int[] arr) {
	    int pivot = arr[high], j = low;
	    for (int i = low; i < high; i++) {
	      if (arr[i] < pivot) {
	        swap(i, j, arr);
	        ++j;
	      }
	    }
	    swap(j, high, arr);
	    return j;
	  }

	  private void swap(int i, int j, int[] arr) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }
	}