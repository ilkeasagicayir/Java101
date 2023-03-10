
package java5;
import java.util.Arrays;

public class java5 {
	public static void main(String[] args) {
		int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
		System.out.println(Arrays.toString(dizi));
		
		Arrays.fill(dizi, 2);
		System.out.println(Arrays.toString(dizi));
		
		Arrays.fill(dizi, 3,5,18);
		System.out.println(Arrays.toString(dizi));
		System.out.println();
		
		int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
		Arrays.sort(liste);
		System.out.println(Arrays.toString(liste));
		
		int index = Arrays.binarySearch(liste, -11);
		System.out.println("-11 in indexi : "+index);
		
		int[] copyArray = Arrays.copyOf(liste, 3);
		System.out.println(Arrays.toString(copyArray));
		
		int[] copyOfRangeArray = Arrays.copyOfRange(liste, 3, 8);
		System.out.println(Arrays.toString(copyOfRangeArray));
		
		System.out.println();
		
		int[] list1 = {1,2,3};
		int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};
        
        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list3, list2));
	}

}
