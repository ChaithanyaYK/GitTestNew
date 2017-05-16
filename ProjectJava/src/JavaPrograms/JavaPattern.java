package JavaPrograms;

public class JavaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		int sp=str.length()-1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				char ch=str.charAt(j);
				System.out.print(ch+ " ");
			} 
			sp--;
			System.out.println();
		}

	}

}
