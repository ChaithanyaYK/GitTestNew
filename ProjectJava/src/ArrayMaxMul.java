
public class ArrayMaxMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={80,10,20,40};
		int highno=0;
		int count=1;
		int mul=1;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>highno)
			{
				highno=a[i];
				count++;
			}
			mul=a[i]*count;
			
		}
		System.out.println("The multiplication of two highest numbers are: "+mul);
	}

}
