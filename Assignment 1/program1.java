import java.util.Scanner;
public class program1
{
    int n;
	int p;
	
	public static void main(String[] args)
	{
		program1 n1 = new program1();
		n1.read();
		System.out.println(n1.power());
	}

    public void read()
		{
			Scanner input = new Scanner(System.in);
			//System.out.println("Enter the base of the number:");
			n=input.nextInt();
			//System.out.println("Enter the exponent: ");
			p=input.nextInt();
		}

    public int power()
		{
			int ans=n;
			if(p<0) ans=0;
			if(p==0) ans=1;
			for(int i=1;i<p;i++)
			{
				ans=ans*n;
			}
			return ans;
		}
		
}

