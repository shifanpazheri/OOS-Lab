import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Fun
{
 static void display(char x,int n)
  {
  for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++)
    {
      System.out.print(x+" ");
    }
    System.out.println("");
  }
  }

  static void display(int n)
  {
     System.out.println(n*(n+1)/2);
  }

  static void display(int a,int b)
  {
    System.out.println(a*a+b*b);
  }
}

public class Q1
{
  public static void main(String args[])
  {
    Scanner input= new Scanner(System.in);
    String data=input.nextLine();
    Scanner newLine= new Scanner(data);

    String temp=newLine.next();
    char c1 = temp.charAt(0);
    if(c1>=48&&c1<=57)
    {
      int x=Integer.parseInt(temp+"");
      if(newLine.hasNextInt())
      {
        int y=newLine.nextInt();
        Fun.display(x,y);
      }
      else
      {
        Fun.display(x);
      }
    }
    else
    {
      int y=newLine.nextInt();
      Fun.display(c1,y);
    }

    /*Fun.display(c,4);
    Fun.display(5);
    Fun.display(2,3);*/
}

}
