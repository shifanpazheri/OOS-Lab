import java.util.Scanner;

public class Q5
{
	
	public static void main(String args[])
	{
		String name;
		String type;
		String food;
		int days;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the inmate details:");
		name=sc.next();
		type=sc.next();
		food=sc.next();
		System.out.println("Enter the number of days:");
		days=sc.nextInt();
		int ans=0;
		
		/*System.out.println(name);
		System.out.println(type);
		System.out.println(food);
		System.out.println(days);
		System.out.println(name.length());
		System.out.println(type.length());
		System.out.println(food.length());
		System.out.println(days);*/
		
		if(food.length()==3&&type.length()==8)
		{
			//System.out.println(" Veg Employee");
			ans=100*days;
			ans=ans+(ans*5)/100;
		}
		else if(food.length()==3&&type.length()==7)
		{
			//System.out.println(" Veg Student");
			ans=100*days;
		}
		else if(food.length()==6&&type.length()==8)
		{
			//System.out.println(" NonVeg Employee");
			ans=120*days;
			ans=ans+(ans*5)/100;
		}
		else
		{
			//System.out.println(" NonVeg Student");
			ans=120*days;
		}
		
		System.out.println(ans);
		
	}
	
}


