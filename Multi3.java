package raj;
class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("current thread:"+Thread.currentThread().getName());
	}
}
public class Multi3 {

	public static void main(String[] args) {
		MyThread3 t1=new MyThread3();
		t1.setName("r");
		MyThread3 t2=new MyThread3();
		t2.setName("a");
		MyThread3 t3=new MyThread3();
		t3.setName("j");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

}
