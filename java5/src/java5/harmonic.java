package java5;

import java.util.*;

public class harmonic {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Harmonik serinin eleman sayısını gir : ");
		int num = inp.nextInt();
		
		double[] liste = new double[num];
		
		double sum = 0.0, avg = 0.0;
		
		for(double i =0.0; i<num;i=i+1.0) {
			double eleman = 0.0;
			eleman = 1.0/(i+1.0);
			
			int j = (int)i;
			liste[j] = eleman;
			
			sum += eleman;
			avg = sum /num;
		}
		System.out.println("Array : "+Arrays.toString(liste));
		System.out.println("Harmonic seri ortalama : "+avg);
		
	}

}
