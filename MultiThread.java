package raj;
import java.lang.Thread;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("i is :"+i);
		}
	}
}
public class MultiThread {

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.run();
		System.out.println(Thread.currentThread().getName());
	}

}
