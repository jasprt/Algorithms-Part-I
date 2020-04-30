package sort;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;

public class SelectionSort {
	
	private boolean compare(int a, int b) {
		if (a > b) {
			return true;
		}
		return false;
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void sort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (compare(a[min], a[j])) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,5,1,0,5,2,7,9,0,8};
		StdOut.println("Unsorted Array: "+Arrays.toString(a));
		SelectionSort ss = new SelectionSort();
		ss.sort(a);
		StdOut.print("Sorted Array: "+Arrays.toString(a));
	}

}
