import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q2
{

  public static void main(String[] args) throws Exception//imp
  {
    Scanner sc =new Scanner(System.in);
    String filename=sc.next();
    try
    {

    File file = new File(filename);
    Scanner input = new Scanner(file);
    while (input.hasNextLine())
    {
      String newLine=input.nextLine();
      try
      {
        long num=Long.parseLong(newLine);
        System.out.println(num);
      }
      catch(NumberFormatException e1)
      {
        System.out.println("OtherCharactersFound");
      }
    }

  }
  catch(FileNotFoundException e2)
  {
    System.out.println(e2);
  }


  }
}
