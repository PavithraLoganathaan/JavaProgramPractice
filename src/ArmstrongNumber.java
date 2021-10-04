
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1513;
		int temp = 0,x;
		int y=number;
		while (number > 0) {
			x = number % 10;
			temp = temp + (x * x * x);
			number = number / 10;


		}

		System.out.println("Result "+temp );
		System.out.println("x "+y );
		if(y==temp) {
			System.out.println("It is a Armstong Number"); } 
		else {
			System.out.println("It is not a Armstong Number"); }


	}

}
