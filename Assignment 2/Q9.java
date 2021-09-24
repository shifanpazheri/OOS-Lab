import java.util.Scanner;

class VideoStoreLauncher
{
	String title;
	int status;
	
	VideoStoreLauncher(String title)
	{
		this.title=title;
		this.status=1;
	}
	
	void print_details()
	{
		System.out.print(title);
	}
}

class Q9
{
	public static void main(String[] args)
	{
		VideoStoreLauncher [] video= new VideoStoreLauncher[10000];
		Scanner input =new Scanner(System.in); 
		int n=0;
		
		System.out.println("1.Add video");
		System.out.println("2.Check availability");
		System.out.println("3.Rent a video");
		System.out.println("4.Return");
		System.out.println("5.List the inventory");
		System.out.println("6.Exit");
		
		while(true)
		{
			System.out.println("\nChoice:");
			int choose;
			
			choose=input.nextInt();
			
			if(choose==1)
			{
				System.out.println("N:");
				int num=input.nextInt();
				String temp=input.nextLine();
				System.out.println("Titles:");
				for(int i=0;i<num;i++)
				{
					String name=input.nextLine();
					video[n++]=new VideoStoreLauncher(name);
				}
			}
			if(choose==2)
			{
				System.out.println("Titles:");
				String temp=input.nextLine();
				String name=input.nextLine();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(name.equals(video[i].title))
					{
						if(video[i].status==1)
							flag=1;
					}
				}
				if(flag==1)
					System.out.println("Available");
				else
					System.out.println("NotAvailable");
			}
			if(choose==3)
			{
				System.out.println("Titles:");
				String temp=input.nextLine();
				String name=input.nextLine();
				for(int i=0;i<n;i++)
				{
					if(name.equals(video[i].title))
					{
						video[i].status=0;
					}
				}
			}
			if(choose==4)
			{
				System.out.println("Titles:");
				String temp=input.nextLine();
				String name=input.nextLine();
				for(int i=0;i<n;i++)
				{
					if(name.equals(video[i].title))
					{
						video[i].status=1;
					}
				}
			}
			if(choose==5)
			{
				System.out.println("Titles:");
				int count=0;
				for(int i=0;i<n;i++)
				{
					if(video[i].status==1)
					{
						count=count+1;
					}
				}
				//System.out.println("count="+count);
				int temp=0;
				for(int i=0;i<n;i++)
				{
					if(video[i].status==1)
					{
						temp++;
						if(temp==count)
						{
							System.out.print("\'\'");
							video[i].print_details();
							System.out.print("\'\'");
						}
						else
						{
							System.out.print("\'\'");
							video[i].print_details();
							System.out.print("\'\'");
							System.out.print(",");
						}
					}
				}
				System.out.println("");
			}
			if(choose==6)
			{
				break;
			}
			
			//System.out.println("");
			
		}
	}
}
