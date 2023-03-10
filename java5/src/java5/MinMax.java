package java5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		int[] list = {15,12,788,1,-1,2,0};
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı gir : ");
		int num = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		for(int i =0; i<list.length;i++) {
			if(num <list[i]) {
				max = list[i];
				min = list[i-1];
				break;
			}
		}
		
		System.out.println("En yakın ve en büyük deger : " + max);
        System.out.println("en küçük ve en yakın deger :  " + min);
	}

}
