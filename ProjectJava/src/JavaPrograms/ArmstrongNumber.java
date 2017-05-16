package JavaPrograms;
import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int rem=0;
		int copy=no,cnt=0,sum=0;
		//count digits
		while(no!=0)
		{
			rem=no%10;
			cnt++;
			no=no/10;
		}
		no=copy;
		//power
		while(no!=0)
		{
			int mul=1;
			rem=no%10;
			for(int i=0;i<=cnt;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not ARmstrong no");
		}
		
		
	}

}
