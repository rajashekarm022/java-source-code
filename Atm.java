package raj;
class Transactions
{
	int amt=5000;
	public void withdraw(int amt)
	{
		if(amt>=20000)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	public void deposit(int amt)
	{
		if(amt==15000)
		{
			amt=amt+10000;
			System.out.println("You have 25000 in your account");
		}
		for(int i=0;i<2;i++)
		{
		amt=amt+5000;
		System.out.println("Money has been deposited in your account");
		}
	}
}
class Withdraw extends Thread
{
	Transactions obj;

	public Withdraw(Transactions obj) {

		this.obj = obj;
	}
	public void run()
	{
		obj.withdraw(5000);
	}
}
class Deposit extends Thread
{
	Transactions obj;

	public Deposit(Transactions obj) {
	
		this.obj = obj;
	}
	public void run()
	{
		obj.deposit(5000);
	}
	
}
public class Atm {

	public static void main(String[] args) {
		Transactions obj=new Transactions();
		Withdraw wd=new Withdraw(obj);
		Deposit dt=new Deposit(obj);
		wd.start();
		dt.start();
		

	}

}
