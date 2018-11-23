package raj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOp2 {

	public static void main(String[] args) {
		String s[]={"Adilabad", "Bhadradri Kothagudem", "Hyderabad", "Jagtial", "Jangaon", "Jayashankar Bhupalpally", "Jogulamba Gadwal", "Kamareddy", "Karimnagar", "Khammam", "Kumuram Bheem", "Mahabubabad", "Mahabubnagar", "Mancherial", "Medak", "Medchal", "Nagarkurnool", "Nalgonda", "Nirmal", "Nizamabad", "Peddapalli", "Rajanna Sircilla", "Rangareddy", "Sangareddy", "Siddipet", "Suryapet", "Vikarabad", "Wanaparthy", "Warangal (Rural)", "Warangal (Urban)", "Yadadri Bhuvanagiri"};
		try
		{
		FileWriter fw=new FileWriter("/home/scls-host22/Desktop/236/districts2.txt");
		BufferedWriter br=new BufferedWriter(fw);
		br.write("Districts Of Telangana");
		br.newLine();
		br.write("----------------------------");
		br.newLine();
		for(int i=0;i<31;i++)
		{
			br.write(s[i]);
			br.newLine();
			br.flush();
			
			
		}
		br.close();
		fw.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException occurred");
		}
	}

}
