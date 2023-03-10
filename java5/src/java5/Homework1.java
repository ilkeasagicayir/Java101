package java5;

import java.util.*;

public class Homework1 {
	
	static void sirala(int[] arr) {
		int temp = 0;
		
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i != j && arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int k : arr){
	        System.out.print(k + " ");
	    }
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu n : ");
		int n = input.nextInt();
		int[] list = new int[n];
		System.out.println("Dizinin elemanlarını giriniz :");
		for(int i = 0; i<list.length;i++) {
			System.out.print(i+". Elemanı :");
			int number = input.nextInt();
			list[i] = number ;
			//System.out.println(Arrays.toString(list));
		}
		
		//Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		sirala(list);
	}
}
