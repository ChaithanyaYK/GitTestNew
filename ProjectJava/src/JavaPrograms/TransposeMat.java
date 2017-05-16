package JavaPrograms;

public class TransposeMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{2,1},{2,1}};
		//int b[]=new int[2];
		//int c[]=new int[2];
		System.out.println("Matrix");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				//b[i]=a[i][j];
				//c[i]=a[i][j];
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix is: ");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+a[j][i]);
			}
			System.out.println();

	}
	}
}
