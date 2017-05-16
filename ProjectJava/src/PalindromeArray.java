
public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]=new char[] {'p','a','d','o','m'};
		int c=0;
		for(int i=0;i<=(a.length/2);i++)
		{
			if(a[i]!=a[a.length-1-i])
			{
			c=c+1;
			break;
			}
		}
		if(c==0)
		{
			System.out.println("Array is palindrome");
		}
		else
		{
			System.out.println("Array not palindrome");
		}
	}

}
