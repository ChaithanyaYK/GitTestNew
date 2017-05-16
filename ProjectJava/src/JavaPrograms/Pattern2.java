package JavaPrograms;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//if((i==j)||(j==1)||(j==2&&i!=1)||(j==3&&i!=1&&i!=2)||(j==4))
				if(i+j<=8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}

}
