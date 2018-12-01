package raj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCount {

	public static void main(String[] args) {
		String s;
		int lcount=0;
		try
		{
		FileReader fileReader=new FileReader("/home/scls-host22/Desktop/236/pledge.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		while((s=bufferedReader.readLine())!=null)
			{
				String s1[]=s.split(" ");
				String s2[]=s.split("");
				for(int i=0;i<s1.length;i++)
				{
					
				}
				System.out.println(s);
				System.out.println("No of words are :"+s1.length);
				System.out.println("No of Characters are :"+s2.length);
			
				lcount=lcount+1;
			}
		System.out.println("No of lines Are:"+lcount);
		
		}
			catch(FileNotFoundException e)
		{
			System.out.println("exception is occured");
		}
	catch(IOException e)
		{
	
		}
		
		}
	
}
