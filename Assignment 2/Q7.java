import java.util.Scanner;

class student
{
	String Roll;
	String Name;
	String Height;
	String Weight;
	
	student(String roll,String name,String height,String weight)
	{
		this.Roll=roll;
		this.Name=name;
		this.Height=height;
		this.Weight=weight;
	}
	
	void print_details()
	{
		System.out.print(Roll+" ");
		System.out.print(Name+" ");
		System.out.print(Height+" ");
		System.out.print(Weight+" ");
	}
	
}

public class Q7
{
	String fun(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=',')
			{
				temp=temp+s.charAt(i);
			}
			//System.out.println(temp);
			
		}
		return temp;
	}
	
	String make_int(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='c'&&s.charAt(i)!='m'&&s.charAt(i)!=',')
			{
				temp=temp+s.charAt(i);
			}
			//System.out.println(temp);
			
		}
		return temp;
	}
	
	public static void main(String args[])
	{
		int n;
		
		Q7 function = new Q7();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students ");
		n=input.nextInt();
		
		System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");
		
		student [] s=new student[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("");
			//String data=sc.nextLine();
			//Scanner input = new Scanner(data);
			//System.out.println(data);
			
			String roll;
			String name;
			String height;
			String weight;
			
			roll=input.next();
			name=input.next();
			name=name+input.next();
			height=input.next();
			weight=input.next();
			
			//roll=function.fun(roll);
			//name=function.fun(name);
			//height=function.fun(height);
			//weight=function.fun(weight);
			
			//System.out.println(roll);
			//System.out.println(name);
			//System.out.println(height);
			//System.out.println(weight);
			
			s[i]=new student(roll,name,height,weight);
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				String v1=function.make_int(s[i].Height);
				String v2=function.make_int(s[j].Height);
				if(Integer.parseInt(v1)>Integer.parseInt(v2))
				{
					student temp1=s[i];
					s[i]=s[j];
					s[j]=temp1;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			s[i].print_details();
			System.out.println("");
		}
		
	}
	
}


