package com.oracle.study.interviews;

import java.util.Arrays;

public class ArrayTesting {

	public static void main(String [] args) {
		
		int a [] = new int [10];
		
		/*System.out.println("Length:"+a.length);
		for(int i=0;i<10;i++) {
			System.out.println("Vaule:("+i+"):"+a[i]);
		}
		
		Arrays.fill(a, 5);*/
		
		boolean [] prime = new boolean [21];
		int [] freq = new int [10];
		Arrays.fill(prime, true);
		
		for(int p=2; p*p<=20; p++) {
			
			for(int j=p*p; j<=20;j+=p)
			{
				prime[j]=false;
			}
		}
		
		for(int i =1;i<=20;i++)
			if(prime[i])
			{
				System.out.print(i);
				System.out.print(",");
			 int temp=i;
			 while(temp!=0) {
			 	freq[temp%10]++;
			 	temp=temp/10;
			 }
			}
		
		Arrays.sort(freq);
		System.out.println("max:"+freq[9]);
	}
}
