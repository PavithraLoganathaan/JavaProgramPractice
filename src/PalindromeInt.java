
public class PalindromeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original=121;
		int num=original;
		int temp ,result=0;
		while(original>0)
		{
			temp=original % 10;
			result= temp + result*10;
			original=original / 10;	
		
			
		}
		System.out.println("result "+result);
		
		if(result==num)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}

	}

}
