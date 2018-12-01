package raj;
class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
			try
			{
				Thread.sleep(500);
			} 
			catch (Exception e) 
			{
				
			}
		}
	}
}
class T1 extends Thread
{
	Table obj;
	T1(Table obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.printTable(6);
	}
}
class T2 extends Thread
{
	Table obj;
	T2(Table obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.printTable(5);
	}
}
public class NonSync 
{

	public static void main(String[] args) 
	{
		Table obj=new Table();
		T1 t1=new T1(obj);
		T2 t2=new T2(obj);
		t1.start();
		t2.start();

	}

}
