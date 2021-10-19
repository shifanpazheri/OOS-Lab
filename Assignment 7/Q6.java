import java.util.*;

class InvalidInputException extends Exception
{
  InvalidInputException(String exceptionText)
  {
    super(exceptionText);
  }
}

class Queue
{
  int []a=new int[10000];
  int front;
  int back;

  Queue()
  {
    front=0;
    back=0;
  }

  public void enqueue(int value)
  {
     a[front++]=value;
     //System.out.println("index value="+index);
     System.out.println("Success");
  }

  public void dequeue()
  {

     //System.out.println("index value="+index);
  try{
     Q6.validateInput(front,back);
     System.out.println(a[back++]);
   }
   catch(Exception e)
   {
     System.out.println("EmptyQueue");
   }
  }

  /*public void printAll()
  {
    for(int i=0;i<index;i++)
    {
      System.out.print(a[i]+" ");
    }
  }*/
}

public class Q6
{

  static void validateInput(int front,int back) throws InvalidInputException
  {
    if(front==back)
    {
      throw new InvalidInputException("Exception");
    }
  }

  public static void main(String [] args)
  {
    Scanner input=new Scanner(System.in);
    Queue q=new Queue();
    while (input.hasNextLine())
    {
      //System.out.println("-------------");
      //q.printAll();
      //System.out.println("\n-------------");
      String data=input.nextLine();
      if(data.equals(""))
        break;
      Scanner newLine=new Scanner(data);
      //System.out.println("printing trail="+data);
      String op=newLine.next();
      if(op.equals("E"))
      {
        int x=newLine.nextInt();
        q.enqueue(x);
      }
      if(op.equals("D"))
      {
        q.dequeue();
      }
    }
  }
}
