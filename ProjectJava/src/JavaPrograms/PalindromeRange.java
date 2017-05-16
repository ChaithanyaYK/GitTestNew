package JavaPrograms;

import java.util.Scanner;

public class PalindromeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long rev,rem,n;
		for(int i=1;i<=1000;i++)
		{
			n=i;
			rev=0;
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			
		if(rev==i)
		{
			System.out.println(i+" Palindrome");
		}
		else
		{
			System.out.println(i+" Not Palindrome");
		}
	}
}

}
