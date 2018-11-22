package raj;

public class Stringrep {

	public static void main(String[] args) {
		
      int c=0;
      String s="when there is will there is a way";
      String ar[]=s.split(" ");
      for (int i = 0; i < ar.length; i++) {
		if(ar[i].equals("there"))
		{
			c++;
		}
	}
      System.out.println("No Of Times Repeated:"+c);
	}

}