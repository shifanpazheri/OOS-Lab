

import java.util.Scanner;

//import q6package1.StudentData;

class StudentDataExtended extends q6package1.StudentData
{
	private String location;
	
	public void addDetails(String id,String name,String location)
	{
		this.setId(id);
		this.setName(name);
		this.location=location;
	}
	
	void printDetails()
	{
		System.out.println(this.getId()+" "+this.getName()+" "+this.location);
	}
	
	static void printDetails(StudentDataExtended []stud,int n)
	{
		System.out.println("\nThe Student Details are:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;i<n;i++)
			{
				if(stud[i].getId().compareTo(stud[j].getId())>0)
				{
					StudentDataExtended temp=stud[i];
					stud[i]=stud[j];
					stud[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			stud[i].printDetails();
		}
	}
	
}

public class Q6
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of students :");
		int n=input.nextInt();
		input.nextLine();
		
		StudentDataExtended []stud=new StudentDataExtended[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the details of Student "+(i+1)+" (id, name, location):\n");
			
		
			String id=input.next();
			String name=input.next();
			String location=input.next();
			
			//System.out.println(id+" "+name+" "+location);
			
			stud[i]=new StudentDataExtended();//imp
			stud[i].addDetails(id,name,location);
			//stud[i].printDetails();
		}
		
		StudentDataExtended.printDetails(stud,n);
		
	}
}


