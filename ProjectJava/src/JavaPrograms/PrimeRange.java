package JavaPrograms;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int no= s.nextInt();
		System.out.println("Prime Numbers are");

		for(int i=2;i<=no;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i==j)
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
