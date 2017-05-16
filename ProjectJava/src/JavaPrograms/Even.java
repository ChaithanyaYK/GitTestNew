package JavaPrograms;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
	     int no=s.nextInt();
		if(no%2!=0)
		{
			System.out.println(no+" is a odd number");
		}
		else
		{
			System.out.println(no+" is even");
		}
	}

}
