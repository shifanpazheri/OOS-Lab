import java.util.Scanner;

public class Q5
{
  public static void main(String []args)
  {
    Scanner input = new Scanner(System.in);
    int p=input.nextInt();
    int q=input.nextInt();
    try
    {
        int [][]a=new int[8][8];
        for(int i=0;i<8;i++)
        {
          for(int j=0;j<8;j++)
          {
            a[i][j]=0;
          }
        }

        int n=input.nextInt();

        for(int i=0;i<n;i++)
        {
          String direction=input.next();
          int magnitude=input.nextInt();
          if(direction.equals("Left"))
          {
            q=q-magnitude;
          }
          if(direction.equals("Right"))
          {
            q=q+magnitude;
          }
          if(direction.equals("Up"))
          {
            p=p-magnitude;
          }
          if(direction.equals("Down"))
          {
            p=p+magnitude;
          }
        }
        a[p-1][q-1]=1;
        System.out.println("["+p+","+q+"]");
    }
    catch(ArrayIndexOutOfBoundsException e1)
    {
      System.out.println("Overflow");
    }
  }
}
