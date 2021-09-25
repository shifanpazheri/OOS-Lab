import java.util.Scanner;

class Employee
{
	int id;
	String name; 
	String department;
	int salary;
	
	/*Employee(int id,String name,String department,int salary)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}*/
}

class Manager extends Employee
{
	int bonus;
	
	Manager(int id,String name,String department,int salary,int bonus)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
		this.bonus=bonus;
	}
	
	static void print(Manager []person,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(person[i].id+" ");
			System.out.print(person[i].name+" ");
			System.out.print(person[i].department+" ");
			System.out.print(person[i].salary+" ");
			System.out.println(person[i].bonus);
		}
	}
	
	static int maxSalary(Manager []person,int n)
	{
		int maxm=0;
		for(int i=0;i<n;i++)
		{
			if(maxm<person[i].salary+person[i].bonus)
			{
				maxm=person[i].salary+person[i].bonus;
			}
		}
		return maxm;
	}
	
	static void maxSalaryManager(Manager []person,int maxSalary,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(person[i].salary+person[i].bonus==maxSalary)
			{	
				System.out.print(person[i].id+" ");
				System.out.print(person[i].name+" ");
				System.out.print(person[i].department+" ");
				System.out.print(person[i].salary+" ");
				System.out.println(person[i].bonus);
			}
		}
	}
}

public class Q4
{
	public static void main(String[] args)
	{
		Manager []person=new Manager[10000];
		int noOfManager=0;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String temp=input.nextLine();
		
		for(int i=0;i<n;i++)
		{
			String data=input.nextLine();
			Scanner newLine=new Scanner(data);
			int id=newLine.nextInt();
			String name=newLine.next(); 
			String department=newLine.next();
			int salary=newLine.nextInt();
			int bonus=newLine.nextInt();
			person[noOfManager++]=new Manager(id,name,department,salary,bonus);
		}
		
		//Manager.print(person,n);
		
		Manager.maxSalaryManager(person,Manager.maxSalary(person,n),n);
	}
}


