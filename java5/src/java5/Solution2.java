package java5;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		//array kaç elemanlı?
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		//array elemanları?
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count =0; //1, -2, 4, -5, 1
		for(int i=0; i<n;i++) {
			int sum =0; //i=0
			for(int j = i; j<n; j++) {
				sum = sum + arr[j];
				if(sum<0) {
					count++;
				}
			}
		}
		System.out.println(count); //9
	}
}
