package JavaPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={50,30,40,60};
		System.out.println("The array elements are: ");

		for(int l=0;l<a.length;l++)
		{
			System.out.println(" "+a[l]);
		}
		int temp=0, i,j;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]>=a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("---------------After Sorting-----------");
		for(j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}

	}

}
