import java.util.Scanner;

class Person
{
	String name;
}

class Patient extends Person
{
	String id;
	
	Patient(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	
	void print()
	{
		System.out.print(id+" ");
		System.out.println(name);		
	}
	
	static void printInOrder(Patient []list,int n)
	{
		System.out.println("List of Patients to be tested are:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int ith=Integer.parseInt(list[i].id.substring(5));
				int jth=Integer.parseInt(list[j].id.substring(5));
				if(ith<jth)
				{
					Patient temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			list[i].print();
		}
	}
}

public class Q5
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of patients:");
		int n=input.nextInt();
		
		Patient []list=new Patient[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the number of patients"+(i+1)+":");
			System.out.print("Name:");
			String name=input.next();
			System.out.print("Patient ID:");
			String id=input.next();
			list[i]=new Patient(name,id);
		}
		System.out.println("");
		
		Patient.printInOrder(list,n);
	}
}
