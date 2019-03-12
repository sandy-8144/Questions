package com.oracle.study.interviews;

import java.util.Scanner;

public class SortedArray012 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		
		while(noOfTestCases > 0) {
			
			int lengthOfArray = sc.nextInt();
			
			String stringInput = sc.nextLine().trim();
			System.out.println("input:"+stringInput+"jjj");
			String [] stringInputArray = stringInput.split("\\s+");
			System.out.println("length:"+stringInputArray.length);
			for(String x: stringInputArray)
				System.out.println(x);
			
			int countZeros=0;
			int countOnes=0;
			int countTwos=0;
			
			for(int i=0; i<lengthOfArray; i++) {
				if(stringInputArray[i].equals("0"))
					countZeros++;
				if(stringInputArray[i].equals("1"))
					countOnes++;
				if(stringInputArray[i].equals("2"))
					countTwos++;					
			}
			
			for(int i=0; i<countZeros; i++) 
				stringInputArray[i]="0";
			for(int i=countZeros; i<countZeros+countOnes; i++) 
				stringInputArray[i]="1";
			for(int i=countZeros+countOnes; i<countZeros+countOnes+countTwos; i++) 
				stringInputArray[i]="2";
			
			System.out.println("Sorted array");
			for(String x: stringInputArray) {
				System.out.print(x);
				System.out.print(",");
			}
			
			noOfTestCases--;
			
		}
		sc.close();
		
	}
}
