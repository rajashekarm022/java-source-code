package raj;

public class Compare2str {

	public static void main(String[] args) {
		String s1="rajashekar";
		String s2="mekala";
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				System.out.println("the character matched is "+s1.charAt(i)+ " and at "+i);
			}
		}

	}

}
