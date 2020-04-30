package sort;

import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class SelectionSort {
	
	private boolean compare(int a, int b) {
		if (a > b) {
			return true;
		}
		return false;
	}
	
	private void swap(Integer[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void sort(Integer[] a) {
		
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
		
		Integer[] a = new Integer[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = StdRandom.uniform(10);
		}
		StdOut.println("Random Unsorted Array: "+Arrays.toString(a));
		SelectionSort ss = new SelectionSort();
		ss.sort(a);
		StdOut.print("Sorted Array: "+Arrays.toString(a));
	}

}
