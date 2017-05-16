package JavaPrograms;
import java.util.Scanner;
public class PerfectNo {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i< no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;

			}
		}
		if(sum==no)
		{
			System.out.println("Number is perfect " +no);
		}
		else
		{
			System.out.println("Number is not perfect "+no);
		}

}
}
