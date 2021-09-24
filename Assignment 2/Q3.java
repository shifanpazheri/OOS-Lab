import java.util.Scanner;

public class Q3
{
	
	public static void main(String args[])
	{
		String name;
		Scanner sc = new Scanner(System.in);
		name=sc.next();
		//System.out.print(name);
		int n= name.length();
		
		int []hash=new int[52];
		
		for(int i=0;i<52;i++)
		{
			hash[i]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			int ascii=name.charAt(i);
			if(ascii>=65&&ascii<=90&&hash[ascii-65]==0)
			{
				hash[ascii-65]=1;
				System.out.print(name.charAt(i));
			}
			
			if(ascii>=97&&ascii<=122&&hash[ascii-97+26]==0)
			{
				hash[ascii-97+26]=1;
				System.out.print(name.charAt(i));
			}
		}
		
	}
	
}

