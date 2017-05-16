package JavaPrograms;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,10,2,5,1,3};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++){
					if(a[i]%2==0)
					{
						sum1=sum1+a[i];
					}
					else
					{
						sum2=sum2+a[i];
					}
		}
		System.out.println("The sum of even numbers are ============>  "+sum1);
		System.out.println("The sum of odd numbers are =============>  "+sum2);

	}

}
