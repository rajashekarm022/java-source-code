package raj;

public class Stars2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j<=i;j--)
			{
				if(j>=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}
	}

}
