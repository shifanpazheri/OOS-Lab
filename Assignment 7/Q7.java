import java.util.*;

public class Q7
{
  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    String hexa=input.next();
    try
    {
      int decimal=Integer.parseInt(hexa,16);
      System.out.println(decimal);
    }
    catch(Exception e)
    {
      System.out.println("InvalidHexadecimal");
    }
  }
}
