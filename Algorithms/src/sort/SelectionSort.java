package sort;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;

public class SelectionSort {
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,5,1,0,5,2,7,9,0,8};
		
		StdOut.println("Unsorted Array: "+Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					min = j;
				}
			swap(a, min, j);
			}
		}
		
		
		
	}

}
