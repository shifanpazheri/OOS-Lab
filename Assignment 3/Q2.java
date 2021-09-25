import java.util.Scanner;

class Inventory
{
	 int id;
	 String name;
	 int unitPrice;
	 
	 Inventory(int id,String name,int unitPrice)
	 {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
	 }
	 
	 void print()
	 {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(unitPrice);
	 }
	 
	 static int getIndex(Inventory [] items,int id,int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 if(items[i].id==id)
				return i;
		 }
		 return 0;
	 }
}

public class Q2
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		Inventory [] items=new Inventory[10000];
		int noOfItems=0;
		
		System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
		
		while(true)
		{
			String data=input.nextLine();
			if(data.equals("OKAY"))
				break;
				
			Scanner newLine = new Scanner(data);
			int id=newLine.nextInt();
			String name=newLine.next();
			int unitPrice=newLine.nextInt();
			items[noOfItems++]=new Inventory(id,name,unitPrice);
		}
		
		/*for(int i=0;i<noOfItems;i++)
		{

			items[i].print();
		}*/
		
		while(true)
		{
			System.out.println("1.Add Invoice");
			System.out.println("2.Exit");
			System.out.println("Choice:");
			
			int choice=input.nextInt();
			if(choice==2)
				break;			
			
			String check=input.nextLine();
			System.out.println("\nAdd Invoice Item(Y/N)");
			check=input.nextLine();
			
			if(check.equals("Y"))
			{	
				int total=0;
				System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
				while(true)
				{
					String data=input.nextLine();
					if(data.equals("OKAY"))
						break;
				
					Scanner newLine = new Scanner(data);
					int id=newLine.nextInt();
					int count=newLine.nextInt();
					int index=Inventory.getIndex(items,id,noOfItems);
		    
					if(total==0)
						System.out.println("****INVOICE****");
					
					//System.out.println(id);
					//System.out.println(count);
					//System.out.println(index);
					total+=count*items[index].unitPrice;
					//System.out.println("total="+total);
					System.out.print(items[index].id);
					System.out.print(",");
					System.out.print(items[index].name);
					System.out.print(",");
					System.out.print(items[index].unitPrice);
					System.out.print(",");
					System.out.println(count);
				}
				System.out.println("Total:"+total);
				System.out.println("********");
			}
		}
	}
}
