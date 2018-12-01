
package raj;
class BookTicket
{
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
class Customer extends Thread
{
	BookTicket book;
	Customer(BookTicket book)
	{
		this.book=book;
	}
	public void run()
	{
		book.bookMyticket();
	}
}
public class Tickets2 
{
	public static void main(String[] args) 
	{
		BookTicket book=new BookTicket();
		Customer t1=new Customer(book);
		t1.setName("confirmed");
		Customer t2=new Customer(book);
		t2.setName("confirmed-2");
		Customer t3=new Customer(book);
		t3.setName("House full");
		t1.start();
		t2.start();
		t3.start();
		}

	}

