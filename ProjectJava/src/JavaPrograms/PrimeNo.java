package JavaPrograms;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
		int count=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(no+" is not Prime");
		}
		else
		{
			System.out.println(no+" is prime");
		}

	}

}
