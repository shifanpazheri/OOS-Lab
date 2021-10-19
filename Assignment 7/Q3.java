import java.util.*;

public class Q3
{
  public static void main(String []args)
  {

    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int []a=new int[5];
    for(int i=0;i<n;i++)
    {
      a[i]=input.nextInt();
    }

    input.nextLine();
    String data=input.nextLine();
    Scanner newLine=new Scanner(data);
    int sum=0;
    //System.out.println("data is"+data);

    try
    {
      while(newLine.hasNextInt())
      {
        int index=newLine.nextInt();
        //System.out.println(index);
        sum=sum+a[index];
      }
      System.out.println(sum);
   }
   catch(ArrayIndexOutOfBoundsException e1)
   {
     System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
   }

  }
}
