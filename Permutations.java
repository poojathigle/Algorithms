package algorithms;
import java.util.Arrays;

class PermutationsOfArrayElements {
	
 /*
  * Given an array, this function prints all possible unique permutations of array elements
  */
 public static void printAllPermutations(int[] arr, int start, int end) {
   if (start == end) {
     System.out.println(Arrays.toString(arr));
   } else {
     for (int i = start; i <= end; i++) {
       swap(start, i, arr);
       printAllPermutations(arr, start + 1, end);
       swap(start, i, arr);
     }
   }
 }

 private static void swap(int i, int j, int[] arr) {
   int temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
 }
}
public class Permutations {

	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4};
		PermutationsOfArrayElements.printAllPermutations(array, 0, array.length-1);
	}
}
