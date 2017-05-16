package JavaPrograms;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ref=new Customer();
		//Step 5
		try{
			ref.withdraw(2000);
		}
		catch(InsufficientBalanceException ib)
		{
			ib.printStackTrace();
		}
	}

}
