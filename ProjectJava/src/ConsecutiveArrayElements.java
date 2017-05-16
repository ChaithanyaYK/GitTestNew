
public class ConsecutiveArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={55,20,30,30,50};
		int count=0;
		for(int i=0;i<a.length-2;i++)
		{

			if(a[i]==a[i+1])
			{
				count++;
			}
			System.out.println("Array elements");

			System.out.println("Consecutive elements: "+count);

		}
	}

}
