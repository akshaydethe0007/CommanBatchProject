package Array;

import java.util.Arrays;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		
		arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=105;
		arr[4]=104;
		
		Arrays.sort(arr);        //sorting of array
		
		
		//System.out.println("Modified arr[] : %s"+Array.toString(arr));
		
		
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[5-3]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}	
		
		String[] str= {"Akshay","Ajinkya","Suraj"};
		
		System.out.println(str[0]);
		System.out.println(str.length);
		
		int[] arr2=arr;
		
		System.out.println("New Arrray array Arr2---"+arr2.length);
		System.out.println(arr2[2]);
		
	}

}
