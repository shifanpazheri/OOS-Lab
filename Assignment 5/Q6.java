import java.util.Scanner;

class Customer
{
  public String name;
  public int mobile;
  public Service []item;
  public Membership mem;
  public int noItem;
  public int total;

  public Customer(String name,int mobile,String memValue)
  {
    this.name=name;
    this.mobile=mobile;
    this.item=new Service[1000];
    this.mem=new Membership(memValue);
    this.noItem=0;
    this.total=0;
  }

  public void addItem(String serviceName,int rate)
  {
    item[noItem++]=new Service(serviceName,rate);
  }

  public void printItems()
  {
    for(int i=0;i<noItem;i++)
    {
      System.out.println((i+1)+"."+item[i].serviceName+"    "+item[i].rate);
    }
  }

}

class Membership
{
  public String member;
  public int discountPercentage;
  public Membership(String member)
  {
    this.member=member;
    this.discountPercentage=0;
    if(member.equals("Silver"))
    {
      this.discountPercentage=10;
    }
    if(member.equals("Gold"))
    {
      this.discountPercentage=15;
    }
    if(member.equals("Premium"))
    {
      this.discountPercentage=20;
    }
  }

  public int getDiscount(int price)
  {
      return price*discountPercentage/100;
  }
  public int finalPrice(int price)
  {
      return price*(100-discountPercentage)/100;
  }

}

class Service
{
  public String serviceName;
  public int rate;
  public Service(String serviceName,int rate)
  {
    this.serviceName=serviceName;
    this.rate=rate;
  }
}

public class Q6
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Customer Details:");
    System.out.print("Name:");
    String name=input.next();
  //  System.out.print("\n");
    System.out.print("Mobile:");
    int mobile=input.nextInt();
    //System.out.print("\n");
    System.out.print("member:");
    String member=input.next();
    System.out.print("\n");
    Customer cust=new Customer(name,mobile,member);
    while(true)
    {
      System.out.print("Add Service(Y/N): ");
      String value=input.next();
      if(value.equals("N"))
      {
        break;
      }
      else
      {
        System.out.print("ServiceName: ");
        String serviceName=input.next();
        //System.out.print("\n");
        System.out.print("Rate: ");
        int rate=input.nextInt();
        //System.out.print("\n");
        cust.addItem(serviceName,rate);
        cust.total=cust.total+rate;
      }

    }
    System.out.println("*****BILL*****");
    System.out.println(cust.name+" "+cust.mobile+" "+cust.mem.member);
    cust.printItems();
    System.out.println("Total: "+cust.total+"-"+cust.mem.getDiscount(cust.total));
    System.out.println("Please Pay: "+(cust.mem.finalPrice(cust.total)));
  }
}
