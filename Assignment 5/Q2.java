import java.util.Scanner;

class Bank
{
  int amount;
  public int interest()
  {
    return 0;
  }
  Bank(int amount)
  {
    this.amount=amount;
  }
}

class SBI extends Bank
{
  public int interest()
  {
    return amount*5/100;
  }
  SBI(int amount)
  {
    super(amount);
  }
}

class ICICI extends Bank
{
  public int interest()
  {
    return amount*6/100;
  }
  ICICI(int amount)
  {
    super(amount);
  }
}

class AXIS extends Bank
{
  public int interest()
  {
    return amount*7/100;
  }
  AXIS(int amount)
  {
    super(amount);
  }
}

public class Q2
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    System.out.print("X = ");
    int amount=input.nextInt();
    SBI sbi=new SBI(amount);
    ICICI icici=new ICICI(amount);
    AXIS axis=new AXIS(amount);
    System.out.println("SBI interest is : "+sbi.interest());
    System.out.println("ICICI interest is : "+icici.interest());
    System.out.println("AXIS interest is : "+axis.interest());
  }
}
