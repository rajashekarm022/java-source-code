package raj;

class Booking extends Thread{
	int n=2;
	public void bookMyticket() {
		
		
		if(n>0)
		{
			n--;
			System.out.println("waiting for payment "+Thread.currentThread().getName());

			System.out.println("successfuly booking  "+Thread.currentThread().getName());
			
		}
		else
		{
			System.out.println("sorry not avable  "+Thread.currentThread().getName());
		}
		
	}
	
}
class Audiance extends Thread{
	Booking book;
	Audiance(Booking book){
		this.book=book;
	}
	public void run(){
		book.bookMyticket();
	}
}
public class Book {
	public static void main(String arg[]){
		Booking book=new Booking();
		Audiance t1=new Audiance(book);
		Audiance t2=new Audiance(book);
		Audiance t3=new Audiance(book);
		t1.start();
		t2.start();
		t3.start();
	}

}