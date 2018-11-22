package raj;

public class TestBigArray {

	public static void main(String[] args) {
		int ar[]={23,51,40,60,15};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max);

	}

}
