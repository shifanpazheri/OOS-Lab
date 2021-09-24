import java.util.Scanner;
public class program3
{
	int n;
	
	public static void main(String args[])
	{
		program3 n1= new program3();
		n1.read();
		n1.countlen();
	}
	
	public void read()
	{
		Scanner input =new Scanner(System.in);
		//System.out.println("Enter the Number:");
		n=input.nextInt();
	}
	
	public void countlen()
	{
		
		int count=0;
		int temp=n;
		while(temp!=0)
		{
			temp=temp/10;
			count=count+1;
		}
		if(n==0) count=1;
		System.out.println(count);
	}
	
}
