package raj;
class Bank
{
	void bankData(){
		System.out.println("Every bank has Interst");
	}
}
class Icici extends Bank
{
	void bankData()
	{
		System.out.println("The Rate Of Interest for ICICI bank is 18%");
	}
}
class Sbi extends Bank
{
	void bankData()
	{
		System.out.println("The Rate of Interest for SBI bank is 6.5%");
	}
}
class AndhraBank extends Bank
{
	void bankData()
	{
		System.out.println("The Rate Of Interest for Andhrabank is 7%");
	}
}
class Citybank extends Bank
{
	void bankData()
	{
		System.out.println("The Rate Of Interest for City bank is 8%");
	}
}
public class BankInterest 
{
	public static void main(String[] args) 
	{
	Bank obj;
	obj=new Icici();
	obj.bankData();
	obj=new Sbi();
	obj.bankData();
	obj=new AndhraBank();
	obj.bankData();
	obj=new Citybank();
	obj.bankData();
	}
}
