import java.util.Scanner;

public class Q1
{
	
	public static void main(String args[])
	{
		int max_val=10000;
		int [] a= new int[max_val];
		int n=0;
		
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		Scanner input = new Scanner(data);
		
        while(input.hasNextInt()){
            a[n++]=(input.nextInt());
        }
        
        if(n==0)
			return ;
        
        
        /*for(int i=0;i<n;i++)
        {
			System.out.print(a[i]+" ");
		}*/
		
		
		
		//System.out.print(a[0]+" ");
		//System.out.print(a[0]+" ");
		int count=2;
		for(int i=2;i<n;i++)
		{
			if(a[i]!=a[i-1]||a[i]!=a[i-2])
			{
				count++;
			//	System.out.print(a[i]+" ");
			}
		}
		System.out.println("The length of the original array is: "+n);
		
		System.out.println("After removing duplicates, the new length of the array is: "+count);
		
	}
	
}

