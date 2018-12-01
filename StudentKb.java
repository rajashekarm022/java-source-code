package raj;

import java.util.Scanner;
class Address
{
	int doorno;
	String street;
	String city;
	public Address(int doorno, String street, String city) 
	{
		super();
		this.doorno = doorno;
		this.street = street;
		this.city = city;
	}
}
	
class Student
{
	int regno;
	String name;
	Address addr;
	public Student(int regno, String name, Address addr) 
	{
		super();
		this.regno = regno;
		this.name = name;
		this.addr = addr;
	}	
}
public class StudentKb
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of Students");
		int n=scanner.nextInt();
		String ar[]=new String[n];
		Student ar1[]=new Student[n];
			for(int i=0;i<ar.length;i++)
			{
				System.out.println("Enter student Details");
				int rollno=scanner.nextInt();
				scanner.nextLine();
				String name=scanner.nextLine();
			
				System.out.println("Enter the address details");
				int door=scanner.nextInt();
				String street=scanner.next();
				scanner.nextLine();
				String city=scanner.nextLine();
				
				
				Address obj1=new Address(door,street,city);
				Student obj2=new Student(rollno,name,obj1);
				ar1[i]=obj2;
			}
				System.out.println("Regno  "+" "+"Name   "+""+" Doorno "+" "+" Street"+"    "+"City");
				System.out.println("==========================================================");
				for (int j = 0; j<ar1.length; j++) 
				{
				System.out.println(ar1[j].regno+"       "+ar1[j].name+"      "+ar1[j].addr.doorno+"       "+ar1[j].addr.street+"      "+ar1[j].addr.city);
				}
	}
}


