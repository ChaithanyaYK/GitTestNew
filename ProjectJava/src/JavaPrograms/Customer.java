package JavaPrograms;
public class Customer
{
	int acctId=2312233;
	double acctBal=20000;
	
	public void deposit(double amount)
	{
		acctBal=acctBal+amount;
		BranchBalance.branchBal=BranchBalance.branchBal+amount;
		display();
	}
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		acctBal=acctBal-amount;
		BranchBalance.branchBal=BranchBalance.branchBal+amount;
		if(acctBal>amount)
		{
			System.out.println("Money can be withdrawable");
		}
		else
		{
			throw new InsufficientBalanceException();
		}
		display();
	}
	public void display()
	{
		System.out.println("Account ID:"+acctId);
		System.out.println("Account Balance:"+acctBal);
		System.out.println("Branch Balance: "+BranchBalance.branchBal);
	}

}
