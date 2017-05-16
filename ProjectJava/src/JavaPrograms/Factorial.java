package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
	   int no=s.nextInt();
	   int fact=1;
	   for(int i=1;i<=no;i++)
	   {
		  	fact=fact*i;

	   }
	   System.out.println("Factorial of "+no+" is " +fact);


	}


}
