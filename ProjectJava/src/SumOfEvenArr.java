
public class SumOfEvenArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,15,6,2,50,22};
		int sum=0;
		System.out.println("The array elements are:");
		for(int j=0;j<a.length;j++)
		{
			
			System.out.println(a[j]);
			if(a[j]%2==0){
			sum=sum+a[j];
			}
		}
		System.out.println("Sum of even numbers in an array is: "+sum);
	}

}
