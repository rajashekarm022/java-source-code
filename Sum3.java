package raj;

public class Sum3 {

	public static void main(String[] args) {
		int a=123;
		
		int q;
		int t=0;
		int i=0;
			while(a==0)
			{
				q=a%10;
			a=a/10;
			
			t=t+q;
			i=i+1;
		}
			System.out.println(t);
	}

}
