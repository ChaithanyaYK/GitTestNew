package JavaPrograms;

public class PowerDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=1;
		int no=145;
		int rem=no%10;

		for(int i=0;i<=rem;i++)
		{
			val=val*rem;

		}
		System.out.println("The power of digits is: "+val);
		no=no/10;


	}

}
