/*
 *   Nathan Nasteff
 *   Delaware Tech
 *   Spring 2019
 */

import java.util.Arrays;

public class HeapSortTester {
	public static void main(String args[]) 
	{
	 Airplane plane1 = new Airplane("AA", 4992, 1);
		 Airplane plane2 = new Airplane("DL", 1345, 2);
		 Airplane plane3 = new Airplane("AA", 4531, 1);
		 Airplane plane4 = new Airplane("DL", 9873, 2);
		 Airplane plane5 = new Airplane("AA", 3414, 3);
		Airplane plane6 = new Airplane("DL", 2366, 1);

		 Airplane arr[] = {plane1, plane2, plane3, plane4, plane5, plane6};
		System.out.println("Given Array"); 
		System.out.println(Arrays.toString(arr)); 

		HeapSort.sort(arr); 

		System.out.println("\nSorted array"); 
		System.out.println(Arrays.toString(arr)); 
	}
}
