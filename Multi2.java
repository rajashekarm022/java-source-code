package raj;
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Current thread is:"+Thread.currentThread().getName());
		}
	}
}
public class Multi2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread2 t=new MyThread2();
		t.setName("Raj");
		MyThread2 t1=new MyThread2();
		t1.setName("Shekar");
		t.start();
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}

	}

}
