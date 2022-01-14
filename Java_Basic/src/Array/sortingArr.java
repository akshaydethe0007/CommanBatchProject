package Array;

public class sortingArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {8,3,25,15,7,1};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
		System.out.println("BEFORE SORT");
		
		
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			
			if(arr[i]>arr[j])
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
		
		
		}
		System.out.println("AFTER SORT");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
	}}


