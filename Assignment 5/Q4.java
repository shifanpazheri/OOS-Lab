import java.util.Scanner;

abstract class Addition
{
  public abstract void add();
  public static int gcd(int a,int b)
  {
    if(b==0) return a;
    return Addition.gcd(b,a%b);
  }
  public static int lcm(int a,int b)
  {
    if(a<b)
    {
      int temp=a;
      a=b;
      b=temp;
    }
    return a*b/Addition.gcd(a,b);
  }
}

class IntegerAddition extends Addition
{
  int x;
  int y;

  IntegerAddition(int x,int y)
  {
    this.x=x;
    this.y=y;
  }

  public void add()
  {
    System.out.println(x+y);
  }

}

class FractionAddition extends Addition
{
  int x;
  int y;
  int p;
  int q;

  FractionAddition(int x,int y,int p,int q)
  {
    this.x=x;
    this.y=y;
    this.p=p;
    this.q=q;
  }

  @Override
  public void add()
  {
    int first=Addition.gcd(x,y);
    x=x/first;
    y=y/first;
    int second=Addition.gcd(p,q);
    p=p/second;
    q=q/second;
    int deno=Addition.lcm(y,q);
    //System.out.println("deno="+deno);
    int num=x*(deno/y)+p*(deno/q);
    System.out.println(num+" / "+deno);
  }

}

public class Q4
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    IntegerAddition intNum=new IntegerAddition(a,b);
    int x=input.nextInt();
    int y=input.nextInt();
    int p=input.nextInt();
    int q=input.nextInt();
    FractionAddition doubleNum=new FractionAddition(x,y,p,q);
    intNum.add();
    doubleNum.add();
  }
}
