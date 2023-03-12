package java5;

import java.util.Arrays;

public class RepetitiveNumbers {
	
	static boolean isFind(int[] arr, int value) {
		for(int i : arr) {
			if(i == value) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] list = {9,9,3,7,8,5,1,5,4,4,1,2,3};
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for(int i = 0; i<list.length;i++) {
			for(int j = 0; j<list.length;j++) {
				if( i!=j && list[i] == list[j]) {
					if(!isFind(duplicate, list[i])) {
						duplicate[startIndex++] = list[i];
					}
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(duplicate));
		
		for(int i : duplicate) {
			if(i != 0) {
					System.out.println(i);
				
			}
		}
	}
}
