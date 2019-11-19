package org.dev.algo;

class SelectionSort{
	public void sort(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min_index]) {
					min_index=j;
				}
			}
			int temp=ar[min_index];
			ar[min_index]=ar[i];
			ar[i]=temp;
		}
	}
	public void printArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+", ");
		}
	}
}

public class SortingEx {
	public static void main(String[] args) {
		int[] ar={64,25,12,22,11};
		SelectionSort ss=new SelectionSort();
		ss.sort(ar);
		System.out.println("Array Sorted");
		ss.printArray(ar);
	}
}
