import java.util.Scanner;
public class program2
{
	int a;
	int b;
	
	public static void main(String args[])
	{
		program2 n1= new program2();
		n1.read();
		//System.out.println("Before Swapping");
		//n1.print();
		//System.out.println("After Swapping");
		n1.swap();
		n1.print();
	}
	
	public void read()
	{
		Scanner input =new Scanner(System.in);
		System.out.println("a=");
		a=input.nextInt();
		System.out.println("b=");
		b=input.nextInt();
	}
	
	public void print()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	public void swap()
	{
		a=a+b;
		b=a-b;
		a=a-b;
	}
	
}
