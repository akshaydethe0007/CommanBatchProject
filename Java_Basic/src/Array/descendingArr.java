package Array;

public class descendingArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[] arr=new int[5];
		
		arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;
		
		
		int[] arr2=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			
			int revid=arr2.length-1;  ///Descending order
			
			arr2[i]=arr[revid-i];  //4-0=4;4-1=3;4-2=2;4-3=1;4-4=0
			
			System.out.println(arr2[i]);
		}
		
	}

}
