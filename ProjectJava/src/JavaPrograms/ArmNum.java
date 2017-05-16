package JavaPrograms;
import java.util.Scanner;

public class ArmNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no: ");
		Scanner s=new Scanner(System.in);
		
		int no=s.nextInt();
		int copy=no, sum=0,mul=1,count=0,rem;
		
		while(no!=0)
		{
			rem=no%10;
			count++;
			no=no/10;
		}
		no=copy;
		while(no!=0)
		{
			rem=no%10;
			for(int i =0;i<=count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("Armstrong No");
		}
		else
		{
			System.out.println("Not armstrong no");
		}
		

	}

}
