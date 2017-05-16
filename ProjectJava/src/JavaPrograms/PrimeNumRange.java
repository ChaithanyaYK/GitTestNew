package JavaPrograms;

import java.util.Scanner;

public class PrimeNumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int copy=n;
		System.out.println("Prime numbers are: ");

		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}

	}

}
