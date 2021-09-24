import java.util.Scanner;
public class program7
{
	int n;
	
	public static void main(String args[])
	{
		program7 n1= new program7();
		n1.read();
		n1.fib();
	}
	
	public void read()
	{
		Scanner input =new Scanner(System.in);
		//System.out.println("Enter the Number:");
		n=input.nextInt();
	}
	
	public void fib()
	{
		int prev=0;
		int current=1;
		if(n<=0) return;
		else if(n==1)
		{
			System.out.print(prev);
		}
		else if(n==2)
		{
			System.out.print(prev+" ");
			System.out.print(current);
		}
		else
		{
			System.out.print(prev+" ");
			System.out.print(current+" ");
			for(int i=3;i<=n;i++)
			{
				int temp=current;
				current+=prev;
				prev=temp;
				System.out.print(current+" ");
			}
		}
	}
	
}
