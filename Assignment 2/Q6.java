import java.util.Scanner;

class student
{
	private String Name;
	private String Roll;
	private int Cgpa;
	private double Percentage;
	
	student(String name,String roll,int cgpa)
	{
		this.Name=name;
		this.Roll=roll;
		this.Cgpa=cgpa;
		this.Percentage=9.5*cgpa;
	}
	
	void print_details()
	{
		System.out.print(Name+" ");
		System.out.print(Roll+" ");
		System.out.print(Cgpa+" ");
		System.out.print(Percentage+" %");
	}
	
}

public class Q6
{
	
	public static void main(String args[])
	{
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students:");
		n=sc.nextInt();
		
		System.out.println("Enter Student Details");
		
		student [] s=new student[n];
		
		for(int i=0;i<n;i++)
		{
			String name;
			String roll;
			int cgpa;
			double percentage;
			
			name=sc.next();
			roll=sc.next();
			cgpa=sc.nextInt();
			
			/*System.out.println(name);
			System.out.println(roll);
			System.out.println(cgpa);*/
			
			s[i]= new student(name,roll,cgpa);
		}
		
		for(int i=0;i<n;i++)
		{
			s[i].print_details();
			System.out.println();
		}
	}
	
}


