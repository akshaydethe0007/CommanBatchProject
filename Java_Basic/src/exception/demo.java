package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {
	public static void main(String[] args)  {
		
		System.out.println("Start");
		
		int a=20;
		int b=0;
		
	int c=a/b;  //  ---------------------------Unchecked exception
	//System.out.println(c);
		
		//FileInputStream file=new FileInputStream("C:\\Users\\AKSHAY\\Desktop\\self.txt");   //-----checked exception(
		
	//	FileNotFoundException
	//	IOException
		
	System.out.println("End");
	}
}
