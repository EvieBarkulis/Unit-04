package IT481_Barkulis_Unit04;

import java.util.*;

public class IT481_Barkulis_Unit04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Version 17
		// Evelyn Barkulis
		// Unit 04
		System.out.print("********** Example #1 ********************\n");
		int[] arr = {10,20,30,40,60,80,90,250,600,150,90};
			
		//return minimum value (test case #1)
		int m = 600;
		
		minValue(arr,m);
		System.out.println("\nThe minimum value is " + m);
		
		//return minimum value (test case #2)
				int v = 250;
				
				minValue(arr,v);
				System.out.println("\nThe minimum value is " + v);
		
		System.out.println("\n********** Example #2 ********************\n");
		//Sort array (test case #1)
		int[] sortArr1 = {84,199,80,73,195,204,126,67,212,216};
		
		sortingArray(sortArr1);
		
		for (int i=0; i < sortArr1.length; i++) {
			System.out.print(sortArr1[i] + " ");
		}
		
		System.out.print("\n\n");
		
		//Sort array (test case #2)
		int[] sortArr2 = {230,225,74,144,228,224,266,216,131};
		
		sortingArray(sortArr2);
		
		for (int i=0; i < sortArr2.length; i++) {
			System.out.print(sortArr2[i] + " ");
		}
		System.out.println("\n\n********** Example #3 ********************\n");
		//Find value in array (test case #1)
		int[] findValue1 = {126,171,74,136,294,283,179,190,194,227};
		int ckValue1 = 283;
		
		checkValue(findValue1,ckValue1);
		System.out.print("\n");
		
		//Find value in array (test case #2)
		int[] findValue2 = {108,130,161,285,247,204,138,99,68,143};
		int ckValue2 = 250;
				
		checkValue(findValue2,ckValue2);
		
	}
	
	public static void checkValue(int[] findArray,int value) {
		Arrays.sort(findArray);
		
		int searchValue = Arrays.binarySearch(findArray,value);
		
		if (searchValue > 0) {
			System.out.println("This value was found in the array: " + value);
		}else {
			System.out.println("This value was not found in the array: " + value);
		}
	}

	public static int minValue(int[] arrofInts, int a) {
		//Create minValue start
		int currmin = 100;
		
		for (int i=0; i < arrofInts.length; i++) {
			if (arrofInts[i] < currmin) {
				currmin = arrofInts[i];
			}
			
		}
		
		return currmin;
		
	}
	
	public  static int[] sortingArray(int[] sortArr) {
				
		Arrays.sort(sortArr);
		
		return sortArr;
		
		
	}

}
