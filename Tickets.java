package raj;
class Ticket extends Thread
{
	int n=2;
	public void select()
	{
		if(n==2||n==1)
			{
				System.out.println("Ticket generated");
				n--;
			}
			else if(n==2||n==1)
			{
				System.out.println("Ticket generated");
				n--;
			}
			else
			{
				System.out.println("House full");
			}
		}
	public void run()
	{
		
	}
}
class G extends Thread
{
	
}
public class Tickets {

	public static void main(String[] args) {
		int m=3;
		for(m=1;m<=3;m++)
		{
		Ticket obj1=new Ticket();
		
		obj1.start();
		}

	}

}
