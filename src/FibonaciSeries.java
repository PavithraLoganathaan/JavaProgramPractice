import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args)
	{
		/* Write a simple Java program which will print Fibonacci series, 
		 * e.g. 1 1 2 3 5 8 13 ... . up to a given number. 
		 * We prepare for cross questions like using iteration over recursion 
		 * and how to optimize the solution using caching and memoization.
 */	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which Fibonacci Series to print");
		 int n=sc.nextInt();
		 sc.close();
		 int result;
		 for(int i=0;i<n;i++)
		 {
			result= Fibonaci(i);
			System.out.println(result);
		 }
	}

	private static int Fibonaci(int i) {
		// TODO Auto-generated method stub
		if(i==0 || i==1)
		{
			return i;
		}
		else
		{
			int x=Fibonaci(i-2)+Fibonaci(i-1);
			return x;
		}
	}
}
