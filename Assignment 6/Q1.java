import java.util.Scanner;

interface Convert{
  public int convertRupees(int rs);
  public int convertDollor(int d);
  public int convertPound(int p);
  public int final_amount(int rs,int d,int p);
}

class Bank implements Convert
{
  int total;

  public Bank(int total)
  {
    this.total=total;
  }

//  @Override
  public int convertRupees(int rs)
  {
    return rs;
  }

//  @Override
  public int convertDollor(int d)
  {
    return d*70;
  }

//  @Override
  public int convertPound(int p)
  {
    return p*100;
  }

  public int final_amount(int rs,int d,int p)
  {
    return total-convertRupees(rs)-convertDollor(d)-convertPound(p);
  }

}

public class Q1
{
  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    int total=input.nextInt();
    Convert acc=new Bank(total);
    int rs=input.nextInt();
    int d=input.nextInt();
    int p=input.nextInt();
    System.out.println(acc.final_amount(rs,d,p));
  }
}
