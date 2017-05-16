package JavaPrograms;

import java.util.Scanner;

public class PalinDromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		long copy=n;
		long rev=0;
		while(n!=0)
		{
			long rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==copy)
		{
			System.out.println(copy+" is palindrome");
		}
	
	else
	{
		System.out.println(copy+ " is not palindrome");
	}
	}
}
