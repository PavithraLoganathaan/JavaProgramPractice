
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String  "am" and "ma" always equals in String Builder
		
		String str="boeb";
		char[] str1=str.toCharArray();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str1[i];
		}
		System.out.println("Reversed String "+str2);
		
		if(str.equals(str2))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
