package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A number is PRIME oR not 
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int copy=n;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			break;
			}
		}
		if(count==1)
		{
			System.out.println(copy+" The number is not prime");
		}
		else
		{
			System.out.println(copy+" The number is prime");
		}

	}

}
