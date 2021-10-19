import java.util.*;

class InvalidInputException extends Exception
{
  InvalidInputException(String exceptionText)
  {
    super(exceptionText);
  }
}

public class Q1
{

  static void validateInput(int n) throws InvalidInputException
  {
    if(n>9)
    {
      throw new InvalidInputException("Exception");
    }
  }

  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    String op=input.next();
    int num1=input.nextInt();
    int num2=input.nextInt();

    try
    {
      validateInput(num1);
      validateInput(num2);
      if(op.equals("+"))
      {
        System.out.println(num1+num2);
      }
      if(op.equals("-"))
      {
        System.out.println(num1-num2);
      }
      if(op.equals("*"))
      {
        System.out.println(num1*num2);
      }
      if(op.equals("/"))
      {
        System.out.println(num1/num2);
      }

    }
    catch(InvalidInputException e1)
    {
      System.out.println("Number is greater than 9. Enter a valid argument");
    }
    catch(ArithmeticException e2)
    {
      System.out.println("ArithmeticException: Division by zero handled. Enter a valid argument");
    }

  }
}
