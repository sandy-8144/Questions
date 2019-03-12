package com.oracle.study.interviews;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {

	/*
	 * 
	 * 
input
1
6
3
1 3 2 9 3 2 (in scanner delimiter is white space)
o/p. 
9 3 3 
	 */
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        arr[i] = scan.nextInt();
		    }
		
		    Arrays.sort(arr);
		    StringBuilder sb = new StringBuilder();
		    
		    for(int i = n-1; i >= n - k; i--){
		        sb.append(Integer.toString(arr[i]) + " ");
		    }
		    System.out.println(sb.toString());
		    test--;
		}
	}
}
