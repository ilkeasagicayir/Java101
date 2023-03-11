package java5;

import java.util.Arrays;

public class Homework2 {
	public static void main(String[] args) {

		int count = 1;
		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));

		for (int i = 0; i < list.length; i++) {
			if (i == 0) {
				for (int j = 0; j < list.length; j++) {
					if (i != j && list[i] == list[j]) {
						count++;
					}
				}
				System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
			} else if (list[i] != list[i - 1]) {
				for (int j = 0; j < list.length; j++) {
					if (i != j && list[i] == list[j]) {
						count++;
					}
				}
				System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
			}
			count = 1;
		}
	}
}
