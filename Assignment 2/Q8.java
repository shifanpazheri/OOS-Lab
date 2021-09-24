import java.util.Scanner;

enum fare
{
	O,F,L;
}

class train
{
	int busno;
	String from;
	String to;
	int distance;
	int fair;
	
	train(int busno,String from,String to,int distance,int fair)
	{
		this.busno=busno;
		this.from=from;
		this.to=to;
		this.distance=distance;
		this.fair=fair;
	}
	
	void print_details()
	{
		System.out.print(busno+" ");
		System.out.print(from+" ");
		System.out.print(to+" ");
		System.out.print(distance+" ");
		if(fair==10)
			System.out.print("O ");
		if(fair==20)
			System.out.print("F ");
		if(fair==24)
			System.out.print("L ");
		System.out.print(distance*fair+" ");
	}
}

public class Q8
{
	public static void main(String args[])
	{
		int max_val=10000;
		train []a= new train[10000];
		Scanner input = new Scanner(System.in);
		int n=0;
		
		while(true)
		{
			System.out.println("\n1-Add details");
			System.out.println("2-Show details");
			System.out.println("3-Exit");
			
			System.out.print("\nEnter choice ");
			int val=0;
			val=input.nextInt();
			
			if(val==1)
			{
				System.out.println("Enter bus details(Busno,from,to,distance,type)");
				String data=input.nextLine();
				data=input.nextLine();
				Scanner sc = new Scanner(data);
				int busno;
				String from;
				String to;
				int distance;
				String flag="";
				
				
				busno=sc.nextInt();
				from=sc.next();
				to=sc.next();
				distance=sc.nextInt();
				int fair=10;
				if(sc.hasNext())
				{	flag=sc.next();
					if(flag.charAt(0)=='F')
						fair=20;
					if(flag.charAt(0)=='L')
						fair=24;
				}
				
				a[n++] =new train(busno,from,to,distance,fair);
			}
			if(val==2)
			{
				System.out.println("Bus Details (Busno,from,to,distance,type, fare)");
				for(int i=0;i<n;i++)
				{
					a[i].print_details();
					System.out.println("");
				}
			}
			if(val==3)
			{
				break;
			}
		}
	}
}
