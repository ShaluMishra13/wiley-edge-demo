package dsa;

import java.util.Scanner;

public class QuickSort {
	static void swap(int[]arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static int partition(int []arr,int l,int h) {
		int pivot=arr[l];
		int i=l;int j=h;	
			while(i<j) {
			while(arr[i]<=pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<j)
			swap(arr,i,j);
			}
			
			swap(arr,i,l);
			return j;
		}
		
	
	public static void quicksort(int[] arr,int l,int h) {
		while(l<h) {
		int pivot=partition(arr,l,h);
		quicksort(arr,l,pivot-1);
		quicksort(arr,pivot+1,h);
		}
	}
  public static void main(String[]arr) {
	  Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		quicksort(arr1,0,n);
		 for(int i=0;i<n;i++) {
			  System.out.print(arr[i]+" ");
		  }

  }
}
