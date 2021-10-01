
public class PrimeNumber {

	
	public static void main(String[] args)
	{
		
		//Print the Prime numbers upto 100
		//Prime number is the one which is divisible by 1 and itself
		int n=100;
		String prime="";
		
		for (int i=1;i<=n;i++)
		{
			int counter=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					counter++;
					
				}
			}
			if(counter==2)
			{
				prime =prime +"\t"+i;
			}
		}
		System.out.println("Result" + prime);
	}
}
