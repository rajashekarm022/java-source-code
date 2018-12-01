package raj;
class Arithmetic
{
	void operation1(int n)
	{
		for(int i=1;i<=3;i++)
		{
			++n;
			System.out.println("Increment is: "+n);
		}
	}
	void operation2(int n)
	{
		for(int i=1;i<=3;i++)
		{
			--n;
		System.out.println("Decrement is: "+n);
		}
	}
}
class Inc extends Thread 
{
	Arithmetic obj;
	Inc(Arithmetic obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.operation1(10);
	}
}
class Dec extends Thread
{
	Arithmetic obj;
	Dec(Arithmetic obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.operation2(10);
	}
}
public class IncDecThread {

	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		Inc i1=new Inc(obj);
		Dec d1=new Dec(obj);
		i1.start();
		d1.start();

	}

}
