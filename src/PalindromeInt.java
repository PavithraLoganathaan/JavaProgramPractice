
public class PalindromeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original=121;
		int temp = 0;
		while(original>0)
		{

			temp= temp + temp*10;
			original=original/10;
			temp=original % 10;
		}

		System.out.println("reversed "+temp);
		if(temp==original)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}

	}

}
