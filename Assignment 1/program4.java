import java.util.Scanner;
public class program4
{
	int n;
	
	public static void main(String args[])
	{
		program4 n1= new program4();
		n1.read();
		n1.reverse();
	}
	
	public void read()
	{
		Scanner input =new Scanner(System.in);
		//System.out.println("Enter the Number:");
		n=input.nextInt();
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
	
	public void reverse()
	{
		
		int count=countlen()-1;
		int temp=n;
		int ans=0;
		
		while(temp!=0)
		{
			ans=ans+temp%10*pow(10,count);
			//System.out.println("ans="+ans);
			temp=temp/10;
			count=count-1;
		}
		System.out.println(ans);
	}
	
}
