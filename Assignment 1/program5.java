import java.util.Scanner;
public class program5
{
	int n;
	int [] a=new int[1000];
	
	public static void main(String args[])
	{
		program5 n1= new program5();
		n1.read();
		n1.sort();
		n1.print();
	}
	
	public void read()
	{
		Scanner input =new Scanner(System.in);
		//System.out.println("Enter the Number:");
		n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
	}
	
	public void sort()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void print()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");//same line
		}
		System.out.println("");
	}
}
