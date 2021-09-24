import java.util.Scanner;

public class Q4
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		String a=input.next();
		int n=a.length();
		Q4 function =new Q4();
		
		int maxm=0;
		String maxval="";
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int value=function.check(a,i,j);
				if(value==1&&(j-i+1)>maxm)
				{
					maxm=j-i+1;
					maxval="";
					for(int p=i;p<=j;p++)
					{
						maxval=maxval+a.charAt(p);
					}
				}
			}
		}
		
		System.out.println(maxm);
	}
	
	int check(String a,int p,int q)
	{
		while(p<q)
		{
			if(a.charAt(p)!=a.charAt(q))
				return 0;
			p++;
			q--;
		}
		return 1;
	}
}
