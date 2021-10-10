import java.util.Scanner;

interface HDFC
{
  public int transaction_HDFC(int amount,int cost);
}

interface ICICI
{
  public int transaction_ICICI(int amount,int cost);
}

class Flipkart implements HDFC,ICICI
{
  int total;
  Flipkart(int total)
  {
    this.total=total;
  }

  public int transaction_HDFC(int amount,int cost)
  {
    total=total+cost;
    System.out.print(total+" ");
    return amount-cost;
  }

  public int transaction_ICICI(int amount,int cost)
  {
    total=total+cost;
    System.out.print(total+" ");
    return amount-cost;
  }

}

public class Q2
{
  public static void main(String []args)
  {
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    Flipkart acc=new Flipkart(0);

    for(int i=0;i<n;i++)
    {
      String bank=input.next();
      int amount=input.nextInt();
      int cost=input.nextInt();
      if(bank.equals("HDFC"))
      {
        System.out.println(acc.transaction_HDFC(amount,cost));
      }
      if(bank.equals("ICICI"))
      {
        System.out.println(acc.transaction_ICICI(amount,cost));
      }
    }

  }
}
