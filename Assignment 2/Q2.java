import java.util.Scanner;

public class Q2
{
	
	public static void main(String args[])
	{
		String name;
		Scanner sc = new Scanner(System.in);
		name=sc.nextLine();
		//System.out.print(name);
		int n= name.length();
		int count=1;
		for(int i=0;i<n;i++)
		{
			if(name.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("Words count is "+count);
		for(int i=0;i<n;i++)
		{
			int ascii=name.charAt(i);
			System.out.println("\'"+name.charAt(i)+"\'"+ascii);
		}
	}
	
}

