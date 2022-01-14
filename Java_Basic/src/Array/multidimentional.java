package Array;

public class multidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr=new int[3][4];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		
		
        arr[1][0]=11;
		arr[1][1]=22;
		arr[1][2]=33;
		arr[1][3]=44;
		

        arr[2][0]=66;
		arr[2][1]=77;
		arr[2][2]=88;
		arr[2][3]=99;
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][2]);
		
		
		      for (int row = 0; row < arr.length; row++) { //this equals to the row in our matrix.
		         for (int col = 0; col < arr[row].length; col++) { //this equals to the column in each row.
		            System.out.print(arr[row][col] + " |");
		         }
		         System.out.println(); 
		      }
		
		
		      System.out.println();
		      System.out.println();
		
		for(int a=0;a<arr.length;a++)
		{
			for(int b=0;b<arr[a].length;b++)
			{
			System.out.print(arr[a][b] + " |");	
			}
			System.out.println();
		}
		
		}

}
 