import java.util.Scanner;
public class program6
{
	int n;
	
	public static void main(String args[])
	{
		program6 n1= new program6();
		n1.read();
		boolean flag=n1.check();
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	public void read()
	{
		Scanner input =new Scanner(System.in);
		//System.out.println("Enter the Number:");
		n=input.nextInt();
	}
	
	public int countlen()
	{
		
		int count=0;
		int temp=n;
		while(temp!=0)
		{
			temp=temp/10;
			count=count+1;
		}
		if(n==0) count=1;
		return count;
	}
	
	public int pow(int a,int b)
	{
		if(a==0) return 0;
		if(b==0) return 1;
		int ans=a;
		for(int i=1;i<b;i++)
		{
			ans=ans*a;
		}
		return ans;
	}
	
	public boolean check()
	{
		int first=countlen()-1;
		int last=1;
		//System.out.println("first"+first);
		//System.out.println("last"+last);
		while(first>=last)
		{
			//System.out.println("first"+first);
			//System.out.println("last"+last);
			if((n/pow(10,first))%10!=(n%pow(10,last))/pow(10,last-1))
			{
				return false;
			}
			first=first-1;
			last=last+1;
		}
		return true;
	}
	
}
