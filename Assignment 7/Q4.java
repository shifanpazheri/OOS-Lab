import java.util.*;

class InvalidInputException extends Exception
{
  InvalidInputException(String exceptionText)
  {
    super(exceptionText);
  }
}

public class Q4
{

  static void validateInput(int n) throws InvalidInputException
  {
    if(n%8!=0)
    {
      throw new InvalidInputException("Exception");
    }
  }

  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    String num=input.next();

    try
    {
      validateInput(num.length());
      String binaryFirst=num.substring(0,8);
      int decimalFirst=Integer.parseInt(binaryFirst,2); //2 is base
      String ans="";
      for(int i=1;i<num.length()/8;i++)
      {
        String binaryValue=num.substring(i*8,i*8+8);
        int decimalValue=Integer.parseInt(binaryValue,2); //2 is base
        int xorValue=decimalValue^decimalFirst;
        ans+=(char)(xorValue);
      }
      System.out.println(ans);
    }
    catch(InvalidInputException e1)
    {
      System.out.println("Incorrect Input");
    }

  }
}
